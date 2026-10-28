package com.example.libreria.controller;

import com.example.libreria.model.Libro;
import com.example.libreria.services.LibroService; // o LibroService, según cómo hayas nombrado tu clase de servicio
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/biblioteca")
public class LibroController {

    @Autowired
    private LibroService libroServices;

    @GetMapping("/todos")
    public List<Libro> mostrarTodos() {
        return libroServices.obtenerTodos();
    }
}