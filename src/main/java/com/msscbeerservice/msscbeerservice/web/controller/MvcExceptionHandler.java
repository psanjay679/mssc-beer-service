package com.msscbeerservice.msscbeerservice.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import javax.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

@ControllerAdvice
public class MvcExceptionHandler {
    public ResponseEntity<List> validationErrorHandler(ConstraintViolationException constraintViolationException) {

        List exceptions = new ArrayList(constraintViolationException.getConstraintViolations().size());
        constraintViolationException.getConstraintViolations().forEach(constraintViolation -> exceptions.add(constraintViolation.toString()));
        return new ResponseEntity(exceptions, HttpStatus.BAD_REQUEST);
    }
}
