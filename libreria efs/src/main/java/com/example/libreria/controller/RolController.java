package com.example.libreria.controller;

import com.example.libreria.model.Rol;
import com.example.libreria.services.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RolController {

    @Autowired
    private RolService rolService;

    @PostMapping("/guardar")
    public Rol guardar(@RequestBody Rol rol) {
        return rolService.guardar(rol);
    }

    @GetMapping("/todos")
    public List<Rol> listar() {
        return rolService.obtenerTodos();
    }
}