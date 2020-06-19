package com.yi.homework.controller.teacher;

import com.yi.homework.controller.BaseController;
import com.yi.homework.model.entity.Homework;
import com.yi.homework.model.vo.request.AddHomeworkItemVO;
import com.yi.homework.model.vo.response.ResultVO;
import com.yi.homework.service.teacher.TeacherHomeworkService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * Project Name: homework-management-system-back-end
 * File Name: TeacherHomeworkController
 * Package Name: com.yi.homework.controller.teacher
 *
 * @author yipple
 * @date 2020/6/18
 * @since 0.0.1
 */
@RestController
@RequestMapping("teacher/homework")
public class TeacherHomeworkController extends BaseController {

    private final TeacherHomeworkService teacherHomeworkService;

    public TeacherHomeworkController(TeacherHomeworkService teacherHomeworkService) {
        this.teacherHomeworkService = teacherHomeworkService;
    }

    @PostMapping
    public ResultVO addHomework(@Validated @RequestBody AddHomeworkItemVO addHomeworkItemVO) {
        return teacherHomeworkService.addHomework(addHomeworkItemVO);
    }

    @DeleteMapping("/{homeworkId}")
    public ResultVO deleteHomework(@PathVariable Long homeworkId) {
        return teacherHomeworkService.deleteHomework(homeworkId);
    }

    @PutMapping
    public ResultVO updateHomework(@Validated @RequestBody Homework homework) {
        return teacherHomeworkService.updateHomework(homework);
    }

    @GetMapping("/{homeworkId}")
    public ResultVO getHomework(@PathVariable("homeworkId") Long homeworkId) {
        return teacherHomeworkService.getHomework(homeworkId);
    }

    @RequestMapping("/page/count")
    public ResultVO getPageCount(Long homeworkId, String homeworkTitle) {
        return teacherHomeworkService.getPageCount(homeworkId, homeworkTitle);
    }

    @RequestMapping("/page/{index}")
    public ResultVO getPage(@PathVariable Integer index, Long homeworkId, String homeworkTitle) {
        return teacherHomeworkService.getPage(index, homeworkId, homeworkTitle);
    }

}
