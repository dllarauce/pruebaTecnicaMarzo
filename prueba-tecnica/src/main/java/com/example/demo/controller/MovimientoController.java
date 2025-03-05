package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Movimiento;
import com.example.demo.service.MovimientoService;

@RestController
@RequestMapping("/movimientos")
public class MovimientoController {
    private final MovimientoService movimientoService;

    public MovimientoController(MovimientoService movimientoService) {
        this.movimientoService = movimientoService;
    }

    @PostMapping
    public Movimiento crearMovimiento(@RequestBody Movimiento movimiento) {
        return movimientoService.crearMovimiento(movimiento);
    }
}
