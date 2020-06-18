package com.yi.homework.model.vo.request;

import com.yi.homework.model.constant.UserType;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * Project Name: homework-management-system-back-end
 * File Name: RegisterVO
 * Package Name: com.yi.homework.model.vo.request
 *
 * @author yipple
 * @date 2020/6/17
 * @since 0.0.1
 */
@Data
public class RegisterVO {

    @NotBlank(message = "账号不能为空")
    private String userId;

    @NotBlank(message = "姓名不能为空")
    private String username;

    @NotBlank(message = "密码不能为空")
    private String password;

    @NotNull(message = "用户类型不能为空")
    @Range(min = UserType.STUDENT, max = UserType.TEACHER, message = "用户类型无效")
    private Integer userType;

}
