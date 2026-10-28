package com.example.libreria.services;

import com.example.libreria.model.Categoria;
import com.example.libreria.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    // Método para guardar una categoría
    public Categoria guardar(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    // Método para listar todas las categorías
    public List<Categoria> obtenerTodas() {
        return categoriaRepository.findAll();
    }
}