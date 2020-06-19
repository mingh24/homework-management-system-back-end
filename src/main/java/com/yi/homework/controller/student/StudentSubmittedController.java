package com.yi.homework.controller.student;

import com.yi.homework.controller.BaseController;
import com.yi.homework.model.vo.request.UpdateStudentHomeworkItemVO;
import com.yi.homework.model.vo.response.ResultVO;
import com.yi.homework.service.student.StudentSubmittedService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * Project Name: homework-management-system-back-end
 * File Name: StudentSubmittedController
 * Package Name: com.yi.homework.controller.student
 *
 * @author yipple
 * @date 2020/6/18
 * @since 0.0.1
 */
@RestController
@RequestMapping("/student/submitted")
public class StudentSubmittedController extends BaseController {

    private final StudentSubmittedService studentSubmittedService;

    public StudentSubmittedController(StudentSubmittedService studentSubmittedService) {
        this.studentSubmittedService = studentSubmittedService;
    }

    @PutMapping
    public ResultVO updateStudentHomework(@Validated @RequestBody UpdateStudentHomeworkItemVO updateStudentHomeworkItemVO) {
        return studentSubmittedService.updateStudentHomework(updateStudentHomeworkItemVO);
    }

    @GetMapping("/{homeworkId}")
    public ResultVO getStudentHomework(@PathVariable("homeworkId") Long homeworkId) {
        return studentSubmittedService.getStudentHomework(homeworkId);
    }

    @RequestMapping("/page/count")
    public ResultVO getPageCount(Long homeworkId, String homeworkTitle) {
        return studentSubmittedService.getPageCount(homeworkId, homeworkTitle);
    }

    @RequestMapping("/page/{index}")
    public ResultVO getPage(@PathVariable Integer index, Long homeworkId, String homeworkTitle) {
        return studentSubmittedService.getPage(index, homeworkId, homeworkTitle);
    }

}
