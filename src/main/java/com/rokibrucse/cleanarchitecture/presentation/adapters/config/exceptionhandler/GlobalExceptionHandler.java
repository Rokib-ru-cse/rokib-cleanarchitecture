package com.rokibrucse.cleanarchitecture.presentation.adapters.config.exceptionhandler;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.rokibrucse.cleanarchitecture.presentation.adapters.config.returnresponse.ReturnReponse;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public ReturnReponse<Object> reponse(Exception ex, WebRequest request) {
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
