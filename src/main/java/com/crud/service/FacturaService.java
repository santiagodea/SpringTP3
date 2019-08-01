package com.crud.service;

import java.util.List;

import com.crud.dto.FacturaDTO;

public interface FacturaService {

	public FacturaDTO create(FacturaDTO FacturaDTO);

	public FacturaDTO finById(Long idFactura);
	
	public List<FacturaDTO> findAll();
	
	public FacturaDTO update(FacturaDTO facturaDTO);
	
	public void delete(Long idFactura);
	
}
