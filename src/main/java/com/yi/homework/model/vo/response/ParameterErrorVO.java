package com.yi.homework.model.vo.response;

import lombok.Data;

/**
 * Project Name: homework-management-system-back-end
 * File Name: ParameterErrorVO
 * Package Name: com.yi.homework.model.vo.response
 *
 * @author yipple
 * @date 2020/6/17
 * @since 0.0.1
 */
@Data
public class ParameterErrorVO {

    private String fieldName;

    private String message;

    public ParameterErrorVO(String fieldName, String message) {
        this.fieldName = fieldName;
        this.message = message;
    }

}
