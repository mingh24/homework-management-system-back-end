package com.yi.homework.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * Project Name: homework-management-system-back-end
 * File Name: Homework
 * Package Name: com.yi.homework.model.entity
 *
 * @author yipple
 * @date 2020/6/15
 * @since 0.0.1
 */
@TableName("homework")
@Data
public class Homework {

    private static final String HOMEWORK_ID = "homework_id";
    private static final String TEACHER_ID = "teacher_id";
    private static final String HOMEWORK_TITLE = "homework_title";
    private static final String HOMEWORK_CONTENT = "homework_content";

    /**
     * 作业编号
     */
    @NotNull
    @TableId(value = HOMEWORK_ID, type = IdType.AUTO)
    private Long homeworkId;

    /**
     * 教师工号
     */
    @NotNull
    @TableField(TEACHER_ID)
    private Long teacherId;

    /**
     * 作业标题
     */
    @NotNull
    @TableField(HOMEWORK_TITLE)
    private String homeworkTitle;

    /**
     * 作业内容
     */
    @NotNull
    @TableField(HOMEWORK_CONTENT)
    private String homeworkContent;

}
