package com.yi.homework.service.teacher;

import com.yi.homework.manager.teacher.TeacherHomeworkManager;
import com.yi.homework.model.entity.Homework;
import com.yi.homework.model.vo.request.AddHomeworkItemVO;
import com.yi.homework.model.vo.response.ResultVO;
import com.yi.homework.service.BaseService;
import org.springframework.stereotype.Service;

/**
 * Project Name: homework-management-system-back-end
 * File Name: TeacherHomeworkService
 * Package Name: com.yi.homework.service.teacher
 *
 * @author yipple
 * @date 2020/6/18
 * @since 0.0.1
 */
@Service
public class TeacherHomeworkService extends BaseService {

    private final TeacherHomeworkManager teacherHomeworkManager;

    public TeacherHomeworkService(TeacherHomeworkManager teacherHomeworkManager) {
        this.teacherHomeworkManager = teacherHomeworkManager;
    }

    public ResultVO addHomework(AddHomeworkItemVO addHomeworkItemVO) {
        addHomeworkItemVO.setTeacherId(getUserId());

        if (teacherHomeworkManager.addHomeworkByVO(addHomeworkItemVO)) {
            return result("发布作业成功");
        } else {
            return failedResult("发布作业失败");
        }
    }

    public ResultVO deleteHomework(Long homeworkId) {
        if (teacherHomeworkManager.deleteHomework(homeworkId)) {
            return result("删除作业成功");
        } else {
            return failedResult("删除作业失败");
        }
    }

    public ResultVO updateHomework(Homework homework) {
        if (teacherHomeworkManager.updateHomework(homework)) {
            return result("更新作业成功");
        } else {
            return failedResult("更新作业失败");
        }
    }

    public ResultVO getHomework(Long homeworkId) {
        return result(teacherHomeworkManager.getHomework(homeworkId));
    }

    public ResultVO getPageCount(Long homeworkId, String homeworkTitle) {
        return result(teacherHomeworkManager.getPageCount(getUserId(), homeworkId, homeworkTitle));
    }

    public ResultVO getPage(Integer index, Long homeworkId, String homeworkTitle) {
        return result(teacherHomeworkManager.getPage(index, getUserId(), homeworkId, homeworkTitle));
    }

}
