package com.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.model.Detalle;

@Repository
public interface DetalleRepository  extends CrudRepository<Detalle, Long> {
}
