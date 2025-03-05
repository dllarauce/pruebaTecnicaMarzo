package com.example.demo.service;

public class SaldoNoDisponibleException extends RuntimeException {
    public SaldoNoDisponibleException(String mensaje) {
        super(mensaje);
    }
}
