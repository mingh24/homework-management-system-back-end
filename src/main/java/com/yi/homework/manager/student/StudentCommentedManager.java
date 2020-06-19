package com.yi.homework.manager.student;

import com.yi.homework.dao.HomeworkDAO;
import com.yi.homework.dao.StudentHomeworkDAO;
import com.yi.homework.manager.BaseManager;
import com.yi.homework.model.vo.response.table.StudentHomeworkItemVO;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Project Name: homework-management-system-back-end
 * File Name: StudentCommentedManager
 * Package Name: com.yi.homework.manager.student
 *
 * @author yipple
 * @date 2020/6/19
 * @since 0.0.1
 */
@Component
public class StudentCommentedManager extends BaseManager {

    private final StudentHomeworkDAO studentHomeworkDAO;

    public StudentCommentedManager(StudentHomeworkDAO studentHomeworkDAO) {
        this.studentHomeworkDAO = studentHomeworkDAO;
    }

    public Integer getPageCount(Long homeworkId, String homeworkTitle, Long studentId) {
        int count = studentHomeworkDAO.countWithTeacherComment(homeworkId, homeworkTitle, studentId, null);
        return calculatePageNum(count, HomeworkDAO.PAGE_SIZE);
    }

    public List<StudentHomeworkItemVO> getPage(Integer index, Long homeworkId, String homeworkTitle, Long studentId) {
        return studentHomeworkDAO.getPageWithTeacherComment(index, homeworkId, homeworkTitle, studentId, null);
    }

}
