package com.yi.homework.service;

import com.yi.homework.manager.LoginStatusManager;
import com.yi.homework.model.bo.LoginStatusBO;
import com.yi.homework.model.vo.response.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpSession;

/**
 * Project Name: homework-management-system-back-end
 * File Name: BaseService
 * Package Name: com.yi.homework.service
 *
 * @author yipple
 * @date 2020/6/17
 * @since 0.0.1
 */
public class BaseService {

    @Autowired
    private HttpSession httpSession;

    @Autowired
    private LoginStatusManager loginStatusManager;

    private LoginStatusBO getLoginStatus() {
        return loginStatusManager.getLoginStatus(httpSession);
    }

    protected Long getUserId() {
        return getLoginStatus().getUserId();
    }

    protected ResultVO result(Object data) {
        return new ResultVO(ResultVO.SUCCESS, "success", data);
    }

    protected ResultVO result(Object data, String message) {
        return new ResultVO(ResultVO.SUCCESS, message, data);
    }

    protected ResultVO failedResult(String message) {
        return new ResultVO(ResultVO.FAIL, message, null);
    }

    protected ResultVO failedResult(String message, Object data) {
        return new ResultVO(ResultVO.FAIL, message, data);
    }

}
