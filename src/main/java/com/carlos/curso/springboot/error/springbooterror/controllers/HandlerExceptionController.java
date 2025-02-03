package com.carlos.curso.springboot.error.springbooterror.controllers;

import com.carlos.curso.springboot.error.springbooterror.models.Error;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class HandlerExceptionController {

  @ExceptionHandler(ArithmeticException.class)
  public ResponseEntity<?> divisionByZero(Exception ex) {
    return ResponseEntity.internalServerError().body("error 500");
  }

}
