package com.example.libreria.services;

import com.example.libreria.model.Rol;
import com.example.libreria.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolService {

    @Autowired
    private RolRepository rolRepository;

    public Rol guardar(Rol rol) {
        return rolRepository.save(rol);
    }

    public List<Rol> obtenerTodos() {
        return rolRepository.findAll();
    }
}