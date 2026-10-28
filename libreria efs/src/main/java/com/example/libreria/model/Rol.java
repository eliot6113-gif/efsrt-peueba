package com.example.libreria.model;

import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre; // Ej: "ADMIN", "CLIENTE", "VENDEDOR"

    public Rol() {}
    public Rol(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    // getters y setters...
}