package com.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.model.Factura;

@Repository
public interface FacturaRepository extends CrudRepository<Factura, Long> {
}

