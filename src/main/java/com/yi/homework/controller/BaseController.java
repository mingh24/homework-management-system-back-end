package com.yi.homework.controller;

import com.yi.homework.model.vo.response.ResultVO;

/**
 * Project Name: homework-management-system-back-end
 * File Name: BaseController
 * Package Name: com.yi.homework.controller
 *
 * @author yipple
 * @date 2020/6/17
 * @since 0.0.1
 */
public class BaseController {

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
