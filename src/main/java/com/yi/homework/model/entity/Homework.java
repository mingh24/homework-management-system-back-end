package com.yi.homework.model.entity;

import lombok.Data;

/**
 * Project Name: homework-management-system-back-end
 * File Name: Homework
 * Package Name: com.yi.homework.model.entity
 *
 * @author yipple
 * @date 2020/6/15
 * @since 0.0.1
 */
@Data
public class Homework {

    private Long homeworkId;

    private Long teacherId;

    private String homeworkTitle;

    private String homeworkContent;

}
