package com.yi.homework.model.bo;

import lombok.Data;

/**
 * Project Name: homework-management-system-back-end
 * File Name: LoginStatusBO
 * Package Name: com.yi.homework.model.bo
 *
 * @author yipple
 * @date 2020/6/15
 * @since 0.0.1
 */
@Data
public class LoginStatusBO {

    private Boolean loggedIn;

    private Long userId;

    private String username;

    private Integer userType;

    public static LoginStatusBO fromAuthInfo(AuthInfoBO authInfoBO) {
        LoginStatusBO loginStatusBO = new LoginStatusBO();
        loginStatusBO.setLoggedIn(true);
        loginStatusBO.setUserId(authInfoBO.getUserId());
        loginStatusBO.setUsername(authInfoBO.getUsername());
        loginStatusBO.setUserType(authInfoBO.getUserType());

        return loginStatusBO;
    }

}
