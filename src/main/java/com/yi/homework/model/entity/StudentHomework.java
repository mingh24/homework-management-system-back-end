package com.yi.homework.model.entity;

import lombok.Data;

/**
 * Project Name: homework-management-system-back-end
 * File Name: StudentHomework
 * Package Name: com.yi.homework.model.entity
 *
 * @author yipple
 * @date 2020/6/15
 * @since 0.0.1
 */
@Data
public class StudentHomework {

    private Long studentHomeworkId;

    private Long studentId;

    private Long homeworkId;

    private String title;

    private String content;

}
