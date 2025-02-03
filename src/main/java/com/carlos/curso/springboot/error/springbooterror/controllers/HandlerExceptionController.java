package com.carlos.curso.springboot.error.springbooterror.controllers;

import com.carlos.curso.springboot.error.springbooterror.models.Error;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class HandlerExceptionController {

  @ExceptionHandler(ArithmeticException.class)
  public ResponseEntity<Error> divisionByZero(Exception ex) {
    Error error = new Error();
    error.setDate(new Date());
    error.setError("Error division por cero!");
    error.setMessage(ex.getMessage());
    error.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(error);
  }

  @ExceptionHandler(NoHandlerFoundException.class)
  public ResponseEntity<Error> notFoundEx(NoHandlerFoundException ex) {
    Error error = new Error();
    error.setDate(new Date());
    error.setError("Api rest no encontrada!");
    error.setMessage(ex.getMessage());
    error.setStatus(HttpStatus.NOT_FOUND.value());
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
  }

  @ExceptionHandler(NumberFormatException.class)
  @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
  public Map<String, Object> numberFormatException(NumberFormatException ex) {
    Map<String, Object> error = new HashMap<>();
    error.put("date", new Date());
    error.put("error", "número invalido o incorrecto, no tiene formato de digito!");
    error.put("message", ex.getMessage());
    error.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
    return error;
  }

}
