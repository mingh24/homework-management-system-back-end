package com.yi.homework.controller.student;

import com.yi.homework.controller.BaseController;
import com.yi.homework.model.vo.response.ResultVO;
import com.yi.homework.service.student.StudentCommentedService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project Name: homework-management-system-back-end
 * File Name: StudentCommentedController
 * Package Name: com.yi.homework.controller.student
 *
 * @author yipple
 * @date 2020/6/19
 * @since 0.0.1
 */
@RestController
@RequestMapping("/student/commented")
public class StudentCommentedController extends BaseController {

    private final StudentCommentedService studentCommentedService;

    public StudentCommentedController(StudentCommentedService studentCommentedService) {
        this.studentCommentedService = studentCommentedService;
    }

    @RequestMapping("/page/count")
    public ResultVO getPageCount(Long homeworkId, String homeworkTitle) {
        return studentCommentedService.getPageCount(homeworkId, homeworkTitle);
    }

    @RequestMapping("/page/{index}")
    public ResultVO getPage(@PathVariable Integer index, Long homeworkId, String homeworkTitle) {
        return studentCommentedService.getPage(index, homeworkId, homeworkTitle);
    }

}
