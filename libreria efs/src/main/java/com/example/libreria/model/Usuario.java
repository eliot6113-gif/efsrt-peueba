package com.example.libreria.model;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String email;
    private String password;

    // Relación con Rol
    @ManyToOne
    @JoinColumn(name = "rol_id") // Esto creará la columna rol_id en la tabla usuarios
    private Rol rol;

    public Usuario() {}
    // getters y setters...
}