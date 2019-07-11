package com.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.model.Precio;

@Repository
public interface PrecioRepository extends CrudRepository<Precio, Long> {
}