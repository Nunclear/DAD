package com.example.msproductoservice.controller;

import com.example.msproductoservice.entity.Producto;
import com.example.msproductoservice.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @GetMapping
    public ResponseEntity<List<Producto>> getAll() {
        return ResponseEntity.ok(productoService.list());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Producto>> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(productoService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Producto> create(@RequestBody Producto Producto) {
        return ResponseEntity.ok(productoService.save(Producto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Producto> update(@PathVariable Integer id,
                                           @RequestBody Producto Producto) {
        Producto.setId(id);
        return ResponseEntity.ok(productoService.save(Producto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<List<Producto>> delete(@PathVariable Integer id) {
        productoService.delete(id);
        return ResponseEntity.ok(productoService.list());
    }
}
