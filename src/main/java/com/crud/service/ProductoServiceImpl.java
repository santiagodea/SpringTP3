package com.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.model.Producto;
import com.crud.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService{
	
	//atributos
	
	@Autowired
	private ProductoRepository productoRepository;
		
	
	@Override
	public Producto create(Producto producto) {
		productoRepository.save(producto);
		return producto;
	}
	
	
	@Override
	public void delete(Long idProveedor) {
		// TODO Auto-generated method stub
	}

	@Override
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
