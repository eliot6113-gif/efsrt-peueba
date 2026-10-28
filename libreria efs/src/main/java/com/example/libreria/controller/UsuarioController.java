package com.example.libreria.controller;

import com.example.libreria.model.Usuario;
import com.example.libreria.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/guardar")
    public Usuario guardar(@RequestBody Usuario usuario) {
        return usuarioService.guardar(usuario);
    }

    @GetMapping("/todos")
    public List<Usuario> listar() {
        return usuarioService.obtenerTodos();
    }
}