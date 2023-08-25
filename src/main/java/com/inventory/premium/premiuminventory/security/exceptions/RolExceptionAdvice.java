package com.inventory.premium.premiuminventory.security.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class RolExceptionAdvice {
    @ResponseBody
    @ExceptionHandler(RolNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String, String> exceptionHandler(RolNotFoundException exception){
        Map<String, String> errorMap = new HashMap<>();
        errorMap.put("Error message: ", exception.getMessage());
        return errorMap;
    }

    @ResponseBody
    @ExceptionHandler(RolNameNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String, String> exceptionHandler(RolNameNotFoundException exception){
        Map<String, String> errorMap = new HashMap<>();
        errorMap.put("Error message: ", exception.getMessage());
        return errorMap;
    }
}
