package com.huya.taftest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author saikei
 * @email lishiji@huya.com
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Result AuthExceptionHandler(HttpServletRequest req, Exception e) {
        return Result.fail(e.getMessage(), ResultCode.FAILURE);
    }
}
