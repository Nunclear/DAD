package com.example.msproductoservice.repository;

import com.example.msproductoservice.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
    List<Producto> findByCode(String code);
}
