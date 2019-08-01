package com.crud.service;

import java.util.List;

import com.crud.model.Producto;

public interface ProductoService {

		public Producto create(Producto producto);
		
		
		
		public void delete(Long idProducto);
		
		public List<Producto> findAll();
}
