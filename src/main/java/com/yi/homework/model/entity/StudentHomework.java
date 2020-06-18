package com.yi.homework.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * Project Name: homework-management-system-back-end
 * File Name: StudentHomework
 * Package Name: com.yi.homework.model.entity
 *
 * @author yipple
 * @date 2020/6/15
 * @since 0.0.1
 */
@TableName("student_homework")
@Data
public class StudentHomework {

    private static final String STUDENT_HOMEWORK_ID = "student_homework_id";
    private static final String STUDENT_ID = "student_id";
    private static final String HOMEWORK_ID = "homework_id";
    private static final String TITLE = "title";
    private static final String CONTENT = "content";
    private static final String TEACHER_COMMENT = "teacher_comment";

    /**
     * 学生作业编号
     */
    @NotNull
    @TableId(value = STUDENT_HOMEWORK_ID, type = IdType.AUTO)
    private Long studentHomeworkId;

    /**
     * 学生学号
     */
    @NotNull
    @TableField(STUDENT_ID)
    private Long studentId;

    /**
     * 作业编号
     */
    @NotNull
    @TableField(HOMEWORK_ID)
    private Long homeworkId;

    /**
     * 提交的标题
     */
    @NotNull
    @TableField(TITLE)
    private String title;

    /**
     * 提交的内容
     */
    @NotNull
    @TableField(CONTENT)
    private String content;

    /**
     * 教师评语
     */
    @NotNull
    @TableField(TEACHER_COMMENT)
    private String teacherComment;

}
