package com.yi.homework.model.vo.request;

import lombok.Data;

/**
 * Project Name: homework-management-system-back-end
 * File Name: UpdateStudentHomeworkItemVO
 * Package Name: com.yi.homework.model.vo.request
 *
 * @author yipple
 * @date 2020/6/18
 * @since 0.0.1
 */
@Data
public class UpdateStudentHomeworkItemVO {

    private Long studentHomeworkId;

    private Long studentId;

    private String studentName;

    private Long homeworkId;

    private String homeworkTitle;

    private String homeworkContent;

    private Long teacherId;

    private String teacherName;

    private String title;

    private String content;

}
