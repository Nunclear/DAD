package com.example.msproductoservice.service;

import com.example.msproductoservice.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {
    List<Producto> list();

    Optional<Producto> findById(Integer id);

    Producto save(Producto producto);

    Producto update(Producto producto);

    void delete(Integer id);
}
