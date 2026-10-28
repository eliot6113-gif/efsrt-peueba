package com.example.libreria.repository;

import com.example.libreria.model.DetalleVenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DetalleVentaRepository extends JpaRepository<DetalleVenta, Long> {


    List<DetalleVenta> findByLibroTitulo(String titulo);
}