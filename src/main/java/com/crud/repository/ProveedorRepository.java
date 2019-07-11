package com.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.model.Proveedor;

@Repository
public interface ProveedorRepository extends CrudRepository<Proveedor, Long> {
}