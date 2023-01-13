package com.rokibrucse.cleanarchitecture.presentation.adapters.config.exceptionhandler;

import java.io.IOException;
import java.sql.SQLException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.rokibrucse.cleanarchitecture.presentation.adapters.config.returnresponse.ReturnReponse;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public ReturnReponse<Object> handleException(Exception ex) {
        ReturnReponse<Object> response = new ReturnReponse<Object>();
        response.setSucceeded(false);
        response.setValue(null);

        if (ex instanceof ApplicationException) {
            response.setMessage(ex.getMessage());
        } else if (ex instanceof IOException) {
            response.setMessage("IOException. ErrorCode:");
        } else if (ex instanceof SQLException) {
            response.setMessage("SQL exception. ErrorCode:");
        } else if (ex instanceof NumberFormatException) {
            response.setMessage("Number format exception. ErrorCode:");
        }

        return response;
    }
}
