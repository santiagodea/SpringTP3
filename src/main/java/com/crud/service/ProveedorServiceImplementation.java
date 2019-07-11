package com.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.model.Proveedor;
import com.crud.repository.ProveedorRepository;

@Service
public class ProveedorServiceImplementation implements ProveedorService{
	
	//atributos
	
	@Autowired
	private ProveedorRepository proveedorRepository;
		
	
	@Override
	public Proveedor create(Proveedor proveedor) {
		
		Proveedor prov1 = new Proveedor(
				proveedor.getCodigo(),
				proveedor.getDescripcion()
				);
		this.proveedorRepository.save(prov1);
		return prov1;
	}

	@Override
	public void delete(Long idProveedor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Proveedor> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
