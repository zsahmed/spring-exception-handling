package com.zakahmed.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by zahmed on 9/23/17.
 */
@Slf4j
@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(GundamModelKitNotFoundException.class)
    public ResponseEntity<ApiError> gundamModelKitNotFoundException(Exception ex) {
        ApiError errorResponse = new ApiError();

        errorResponse.setStatus(1004);
        errorResponse.setMessage(ex.getLocalizedMessage());
        log.warn("GundamModelKitNotFoundException");
        errorResponse.setUserMessage("An error occurred while retrieving GundamModelKit");

        return new ResponseEntity<ApiError>(errorResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public ResponseEntity<ApiError> httpRequestMethodNotSupportedExceptionHandler(Exception ex) {
        ApiError errorResponse = new ApiError();

        errorResponse.setStatus(1000);
        errorResponse.setMessage(ex.getLocalizedMessage());
        errorResponse.setUserMessage("Invalid path");

        return new ResponseEntity<ApiError>(errorResponse, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiError> genericExceptionHandler(Exception ex) {
        ApiError errorResponse = new ApiError();

        errorResponse.setStatus(1005);
        errorResponse.setMessage(ex.getLocalizedMessage());
        errorResponse.setUserMessage("An error occurred in the GundamModelKitApplication");

        return new ResponseEntity<ApiError>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
