package com.example.libreria.services;

import com.example.libreria.model.DetalleVenta;
import com.example.libreria.model.Venta;
import com.example.libreria.repository.DetalleVentaRepository;
import com.example.libreria.repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentaService {

    @Autowired
    private VentaRepository ventaRepository;

    // --- AGREGAMOS ESTA LÍNEA NUEVA ---
    @Autowired
    private DetalleVentaRepository detalleVentaRepository;

    public Venta guardar(Venta venta) {
        return ventaRepository.save(venta);
    }

    public List<Venta> obtenerTodas() {
        return ventaRepository.findAll();
    }

    // --- AGREGAMOS ESTE MÉTODO NUEVO ---
    public List<DetalleVenta> buscarComprasPorLibro(String titulo) {
        return detalleVentaRepository.findByLibroTitulo(titulo);
    }
}