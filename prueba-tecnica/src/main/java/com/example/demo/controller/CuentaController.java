package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Cuenta;
import com.example.demo.repository.CuentaRepository;

@RestController
@RequestMapping("/cuentas")
public class CuentaController {
    private final CuentaRepository cuentaRepository;

    public CuentaController(CuentaRepository cuentaRepository) {
        this.cuentaRepository = cuentaRepository;
    }

    @PostMapping
    public Cuenta crearCuenta(@RequestBody Cuenta cuenta) {
        return cuentaRepository.save(cuenta);
    }
}