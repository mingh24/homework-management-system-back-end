package com.yi.homework.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * Project Name: homework-management-system-back-end
 * File Name: Teacher
 * Package Name: com.yi.homework.model.entity
 *
 * @author yipple
 * @date 2020/6/15
 * @since 0.0.1
 */
@Data
public class Teacher {

    private static final String TEACHER_ID = "teacher_id";
    private static final String TEACHER_NAME = "teacher_name";
    private static final String PASSWORD = "password";

    /**
     * 教师工号
     */
    @NotNull
    @TableId(value = TEACHER_ID)
    private Long teacherId;

    /**
     * 教师姓名
     */
    @NotNull
    @TableField(TEACHER_NAME)
    private String teacherName;

    /**
     * 教师密码
     */
    @NotNull
    @TableField(PASSWORD)
    private String password;

}
