package com.yi.homework.model.vo.response.table;

import lombok.Data;

/**
 * Project Name: homework-management-system-back-end
 * File Name: StudentHomeworkItemVO
 * Package Name: com.yi.homework.model.vo.table
 *
 * @author yipple
 * @date 2020/6/17
 * @since 0.0.1
 */
@Data
public class StudentHomeworkItemVO {

    private Long studentHomeworkId;

    private Long studentId;

    private String studentName;

    private Long homeworkId;

    private String homeworkTitle;

    private String homeworkContent;

    private String title;

    private String content;

    private String teacherComment;

}
