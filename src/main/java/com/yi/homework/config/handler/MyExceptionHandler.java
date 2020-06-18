package com.yi.homework.config.handler;

import com.yi.homework.model.constant.HttpStatusCode;
import com.yi.homework.model.vo.response.ParameterErrorVO;
import com.yi.homework.model.vo.response.ResultVO;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Project Name: homework-management-system-back-end
 * File Name: MyExceptionHandler
 * Package Name: com.yi.homework.config.handler
 *
 * @author yipple
 * @date 2020/6/17
 * @since 0.0.1
 */
@RestControllerAdvice
public class MyExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public ResultVO handleArgumentNotValidException(MethodArgumentNotValidException methodArgumentNotValidException, HttpServletResponse httpServletResponse) {
        List<ParameterErrorVO> parameterErrorVOList = new ArrayList<>();

        List<ObjectError> objectErrorList = methodArgumentNotValidException.getBindingResult().getAllErrors();
        for (ObjectError objectError : objectErrorList) {
            String fieldName = ((FieldError) objectError).getField();
            String message = objectError.getDefaultMessage();
            parameterErrorVOList.add(new ParameterErrorVO(fieldName, message));
        }

        parameterErrorVOList.sort(Comparator.comparing(ParameterErrorVO::getFieldName));
        String message = "请求参数无效";

        if (parameterErrorVOList.size() > 0) {
            ParameterErrorVO firstError = parameterErrorVOList.get(0);
            message += ": " + firstError.getFieldName() + "-" + firstError.getMessage();
        }

        httpServletResponse.setStatus(HttpStatusCode.BAD_REQUEST);
        return new ResultVO(ResultVO.INVALID_PARAMETER, message, objectErrorList);
    }

}

