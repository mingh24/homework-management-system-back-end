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

    private Long id;

    private String name;

    private Integer userType;

    public static LoginStatusBO fromAuthInfo(AuthInfoBO authInfoBO) {
        LoginStatusBO loginStatusBO = new LoginStatusBO();
        loginStatusBO.setLoggedIn(true);
        loginStatusBO.setId(authInfoBO.getId());
        loginStatusBO.setName(authInfoBO.getName());
        loginStatusBO.setUserType(authInfoBO.getUserType());

        return loginStatusBO;
    }

}
