package com.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.model.Producto;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Long> {
}