package com.yi.homework.service.student;

import com.yi.homework.manager.student.StudentHomeworkManager;
import com.yi.homework.model.vo.response.ResultVO;
import com.yi.homework.model.vo.response.table.StudentHomeworkItemVO;
import com.yi.homework.service.BaseService;
import org.springframework.stereotype.Service;

/**
 * Project Name: homework-management-system-back-end
 * File Name: StudentHomeworkService
 * Package Name: com.yi.homework.service.student
 *
 * @author yipple
 * @date 2020/6/18
 * @since 0.0.1
 */
@Service
public class StudentHomeworkService extends BaseService {

    private final StudentHomeworkManager studentHomeworkManager;

    public StudentHomeworkService(StudentHomeworkManager studentHomeworkManager) {
        this.studentHomeworkManager = studentHomeworkManager;
    }

    public ResultVO submitStudentHomework(StudentHomeworkItemVO studentHomeworkItemVO) {
        studentHomeworkItemVO.setStudentId(getUserId());

        if (studentHomeworkManager.submitStudentHomework(studentHomeworkItemVO)) {
            return result("提交作业成功");
        } else {
            return failedResult("提交作业失败");
        }
    }

    public ResultVO getHomework(Long homeworkId) {
        return result(studentHomeworkManager.getHomework(homeworkId));
    }

    public ResultVO getPageCount(Long homeworkId, String homeworkTitle) {
        return result(studentHomeworkManager.getPageCount(getUserId(), homeworkId, homeworkTitle));
    }

    public ResultVO getPage(Integer index, Long homeworkId, String homeworkTitle) {
        return result(studentHomeworkManager.getPage(index, getUserId(), homeworkId, homeworkTitle));
    }

}
