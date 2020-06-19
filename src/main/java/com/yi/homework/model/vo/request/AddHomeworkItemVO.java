package com.yi.homework.model.vo.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * Project Name: homework-management-system-back-end
 * File Name: AddHomeworkItemVO
 * Package Name: com.yi.homework.model.vo.request
 *
 * @author yipple
 * @date 2020/6/18
 * @since 0.0.1
 */
@Data
public class AddHomeworkItemVO {

    private Long teacherId;

    @NotBlank
    private String homeworkTitle;

    @NotBlank
    private String homeworkContent;

}
