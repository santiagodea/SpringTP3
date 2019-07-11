package com.crud.service;

import java.util.List;

import com.crud.model.Proveedor;

public interface ProveedorService {
		
	public Proveedor create(Proveedor proveedor);
	
	public void delete(Long idProveedor);
	
	public List<Proveedor> findAll();
}
