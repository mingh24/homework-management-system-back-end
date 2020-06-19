package com.yi.homework.controller.student;

import com.yi.homework.controller.BaseController;
import com.yi.homework.model.vo.response.ResultVO;
import com.yi.homework.model.vo.response.table.StudentHomeworkItemVO;
import com.yi.homework.service.student.StudentHomeworkService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * Project Name: homework-management-system-back-end
 * File Name: StudentHomeworkController
 * Package Name: com.yi.homework.controller.student
 *
 * @author yipple
 * @date 2020/6/18
 * @since 0.0.1
 */
@RestController
@RequestMapping("/student/homework")
public class StudentHomeworkController extends BaseController {

    private final StudentHomeworkService studentHomeworkService;

    public StudentHomeworkController(StudentHomeworkService studentHomeworkService) {
        this.studentHomeworkService = studentHomeworkService;
    }

    @PostMapping
    public ResultVO submitHomework(@Validated @RequestBody StudentHomeworkItemVO studentHomeworkItemVO) {
        return studentHomeworkService.submitStudentHomework(studentHomeworkItemVO);
    }

    @GetMapping("/{homeworkId}")
    public ResultVO getHomework(@PathVariable("homeworkId") Long homeworkId) {
        return studentHomeworkService.getHomework(homeworkId);
    }

    @RequestMapping("/page/count")
    public ResultVO getPageCount(Long homeworkId, String homeworkTitle) {
        return studentHomeworkService.getPageCount(homeworkId, homeworkTitle);
    }

    @RequestMapping("/page/{index}")
    public ResultVO getPage(@PathVariable Integer index, Long homeworkId, String homeworkTitle) {
        return studentHomeworkService.getPage(index, homeworkId, homeworkTitle);
    }

}
