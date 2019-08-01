package com.crud.service;

import java.util.List;

import com.crud.dto.DetalleDTO;
import com.crud.model.Detalle;

public interface DetalleService {

	public DetalleDTO create(DetalleDTO detalleDTO);

	public DetalleDTO finById(Long idDetalle);
	
	public List<DetalleDTO> findAll();
	
	public DetalleDTO update(DetalleDTO detalleDTO);
	
	public void delete(Long idDetalle);
}
