package com.example.libreria.controller;

import com.example.libreria.model.Categoria;
import com.example.libreria.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")  //
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaServices;

    // URL: POST http://localhost:8080/categorias/guardar
    @PostMapping("/guardar")
    public Categoria guardarCategoria(@RequestBody Categoria categoria) {
        return categoriaServices.guardar(categoria);
    }

    // URL: GET http://localhost:8080/categorias/todos
    @GetMapping("/todos")
    public List<Categoria> mostrarCategorias() {
        return categoriaServices.obtenerTodas();
    }
}