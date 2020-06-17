package com.yi.homework.model.vo;

import com.yi.homework.model.constant.UserType;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * Project Name: homework-management-system-back-end
 * File Name: LoginVO
 * Package Name: com.yi.homework.model.vo
 *
 * @author yipple
 * @date 2020/6/15
 * @since 0.0.1
 */
@Data
public class LoginVO {

    @NotBlank(message = "账号不能为空")
    private String id;

    @NotBlank(message = "密码不能为空")
    private String password;

    @NotNull(message = "用户类型不能为空")
    @Range(min = UserType.STUDENT, max = UserType.TEACHER, message = "用户类型无效")
    private Integer userType;

}
