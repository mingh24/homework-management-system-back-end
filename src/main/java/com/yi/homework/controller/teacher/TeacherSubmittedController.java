package com.yi.homework.controller.teacher;

import com.yi.homework.controller.BaseController;
import com.yi.homework.model.entity.StudentHomework;
import com.yi.homework.model.vo.response.ResultVO;
import com.yi.homework.service.teacher.TeacherSubmittedService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * Project Name: homework-management-system-back-end
 * File Name: TeacherSubmittedController
 * Package Name: com.yi.homework.controller.teacher
 *
 * @author yipple
 * @date 2020/6/18
 * @since 0.0.1
 */
@RestController
@RequestMapping("/teacher/submitted")
public class TeacherSubmittedController extends BaseController {

    private final TeacherSubmittedService teacherSubmittedService;

    public TeacherSubmittedController(TeacherSubmittedService teacherSubmittedService) {
        this.teacherSubmittedService = teacherSubmittedService;
    }

    @PutMapping
    public ResultVO updateStudentHomework(@Validated @RequestBody StudentHomework studentHomework) {
        return teacherSubmittedService.updateStudentHomework(studentHomework);
    }

    @GetMapping("/{studentHomeworkId}")
    public ResultVO getStudentHomework(@PathVariable("studentHomeworkId") Long studentHomeworkId) {
        return teacherSubmittedService.getStudentHomework(studentHomeworkId);
    }

    @RequestMapping("/page/count")
    public ResultVO getPageCount(Long homeworkId, String homeworkTitle, Long studentId, String studentName) {
        return teacherSubmittedService.getPageCount(homeworkId, homeworkTitle, studentId, studentName);
    }

    @RequestMapping("/page/{index}")
    public ResultVO getPage(@PathVariable Integer index, Long homeworkId, String homeworkTitle, Long studentId, String studentName) {
        return teacherSubmittedService.getPage(index, homeworkId, homeworkTitle, studentId, studentName);
    }

}
