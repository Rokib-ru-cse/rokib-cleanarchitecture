package com.rokibrucse.cleanarchitecture.presentation.adapters.config.exceptionhandler;

import java.io.IOException;
import java.sql.SQLException;
import java.util.*;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.rokibrucse.cleanarchitecture.presentation.adapters.config.returnresponse.ReturnReponse;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<Object> handleException(Exception ex, WebRequest request) {
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
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
            HttpHeaders headers,
            HttpStatus status, WebRequest request) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getFieldErrors()
                .forEach(error -> errors.put(error.getField(), error.getDefaultMessage()));
        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }
}
