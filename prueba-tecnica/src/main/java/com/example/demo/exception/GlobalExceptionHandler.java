package com.example.demo.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.service.SaldoNoDisponibleException;

@RestControllerAdvice
public class GlobalExceptionHandler {
    
    @ExceptionHandler(SaldoNoDisponibleException.class)
    public ResponseEntity<String> handleSaldoNoDisponible(SaldoNoDisponibleException ex) {
        return ResponseEntity.badRequest().body(ex.getMessage());
    }
}
