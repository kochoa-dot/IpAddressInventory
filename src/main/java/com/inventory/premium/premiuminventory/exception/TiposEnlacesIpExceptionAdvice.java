package com.inventory.premium.premiuminventory.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class TiposEnlacesIpExceptionAdvice {
    @ResponseBody
    @ExceptionHandler(TiposEnlacesIpNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String, String> exceptionHandler(TiposEnlacesIpNotFoundException exception) {
        Map<String, String> errorMap = new HashMap<>();
        errorMap.put("Error Message: ", exception.getMessage());
        return errorMap;
    }

    @ResponseBody
    @ExceptionHandler(TiposEIpNameNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String, String> exceptionHandler(TiposEIpNameNotFoundException exception) {
        Map<String, String> errorMap = new HashMap<>();
        errorMap.put("Error Message: ", exception.getMessage());
        return errorMap;
    }
}
