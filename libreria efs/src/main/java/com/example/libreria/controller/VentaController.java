package com.example.libreria.controller;

import com.example.libreria.model.Venta;
import com.example.libreria.services.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ventas")
public class VentaController {

    @Autowired
    private VentaService ventaService;

    @PostMapping("/guardar")
    public Venta guardarVenta(@RequestBody Venta venta) {
        return ventaService.guardar(venta);
    }

    @GetMapping("/todas")
    public List<Venta> mostrarVentas() {
        return ventaService.obtenerTodas();
    }
}