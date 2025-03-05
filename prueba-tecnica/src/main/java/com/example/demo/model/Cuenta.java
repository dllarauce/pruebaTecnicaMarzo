package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Data
public class Cuenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numeroCuenta;
    private String tipoCuenta;
    private double saldoInicial;
    private boolean estado;
    
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
}
