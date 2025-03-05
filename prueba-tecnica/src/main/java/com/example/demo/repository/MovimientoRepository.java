package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Movimiento;

public interface MovimientoRepository extends JpaRepository<Movimiento, Long> {
}