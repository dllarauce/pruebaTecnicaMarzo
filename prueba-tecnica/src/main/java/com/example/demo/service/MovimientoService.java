package com.example.demo.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Cuenta;
import com.example.demo.model.Movimiento;
import com.example.demo.repository.CuentaRepository;
import com.example.demo.repository.MovimientoRepository;

@Service
public class MovimientoService {
    private final MovimientoRepository movimientoRepository;
    private final CuentaRepository cuentaRepository;

    public MovimientoService(MovimientoRepository movimientoRepository, CuentaRepository cuentaRepository) {
        this.movimientoRepository = movimientoRepository;
        this.cuentaRepository = cuentaRepository;
    }

    @Transactional
    public Movimiento crearMovimiento(Movimiento movimiento) {
        Cuenta cuenta = movimiento.getCuenta();
        double nuevoSaldo = cuenta.getSaldoInicial() + movimiento.getValor();
        
        if(nuevoSaldo < 0) {
            throw new SaldoNoDisponibleException("Saldo no disponible");
        }
        
        cuenta.setSaldoInicial(nuevoSaldo);
        cuentaRepository.save(cuenta);
        
        movimiento.setFecha(LocalDate.now());
        movimiento.setSaldo(nuevoSaldo);
        return movimientoRepository.save(movimiento);
    }
}