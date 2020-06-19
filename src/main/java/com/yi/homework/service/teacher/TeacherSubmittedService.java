package com.yi.homework.service.teacher;

import com.yi.homework.manager.teacher.TeacherSubmittedManager;
import com.yi.homework.model.entity.StudentHomework;
import com.yi.homework.model.vo.response.ResultVO;
import com.yi.homework.service.BaseService;
import org.springframework.stereotype.Component;

/**
 * Project Name: homework-management-system-back-end
 * File Name: TeacherSubmittedService
 * Package Name: com.yi.homework.service.teacher
 *
 * @author yipple
 * @date 2020/6/18
 * @since 0.0.1
 */
@Component
public class TeacherSubmittedService extends BaseService {

    private final TeacherSubmittedManager teacherSubmittedManager;

    public TeacherSubmittedService(TeacherSubmittedManager teacherSubmittedManager) {
        this.teacherSubmittedManager = teacherSubmittedManager;
    }

    public ResultVO updateStudentHomework(StudentHomework studentHomework) {
        if (teacherSubmittedManager.updateStudentHomework(studentHomework)) {
            return result("点评学生作业成功");
        } else {
            return failedResult("点评学生作业失败");
        }
    }

    public ResultVO getStudentHomework(Long studentHomeworkId) {
        return result(teacherSubmittedManager.getStudentHomework(studentHomeworkId));
    }

    public ResultVO getPageCount(Long homeworkId, String homeworkTitle, Long studentId, String studentName) {
        return result(teacherSubmittedManager.getPageCount(getUserId(), homeworkId, homeworkTitle, studentId, studentName));
    }

    public ResultVO getPage(Integer index, Long homeworkId, String homeworkTitle, Long studentId, String studentName) {
        return result(teacherSubmittedManager.getPage(index, getUserId(), homeworkId, homeworkTitle, studentId, studentName));
    }
}
