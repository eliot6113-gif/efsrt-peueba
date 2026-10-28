package com.example.libreria.model;

import jakarta.persistence.*;

@Entity
@Table(name = "libros")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double precio;
    private Integer stock;
    private String titulo;
    private String autor;

    // --- AQUÍ ESTABLECEMOS LA RELACIÓN ---
    @ManyToOne
    @JoinColumn(name = "categoria_id") // Esto crea la columna categoría_id en la tabla libros
    private Categoria categoria;

    public Libro() {}

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public Categoria getCategoria() { return categoria; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }
}