package com.yi.homework.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * Project Name: homework-management-system-back-end
 * File Name: Student
 * Package Name: com.yi.homework.model.entity
 *
 * @author yipple
 * @date 2020/6/15
 * @since 0.0.1
 */
@TableName("student")
@Data
public class Student {

    private static final String STUDENT_ID = "student_id";
    private static final String STUDENT_NAME = "student_name";
    private static final String PASSWORD = "password";

    /**
     * 学生学号
     */
    @NotNull
    @TableId(value = STUDENT_ID)
    private Long studentId;

    /**
     * 学生姓名
     */
    @NotNull
    @TableField(STUDENT_NAME)
    private String studentName;

    /**
     * 学生密码
     */
    @NotNull
    @TableField(PASSWORD)
    private String password;

}
