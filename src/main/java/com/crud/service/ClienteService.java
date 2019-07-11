package com.crud.service;

import java.util.List;

import com.crud.dto.ClienteDTO;

public interface ClienteService {
	
	public ClienteDTO create(ClienteDTO clienteDTO);

	public ClienteDTO finById(Long idCliente);

	
	
	
	public List<ClienteDTO> findAll();
	
	public ClienteDTO update(ClienteDTO clienteDTO);
	
	public void delete(Long idCliente);
	

}
