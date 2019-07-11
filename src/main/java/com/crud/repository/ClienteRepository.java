package com.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.model.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {		// Le indico el tipo de dato y la primary key
}