package com.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.dto.ClienteDTO;
import com.crud.model.Cliente;
import com.crud.repository.ClienteRepository;

@Service
public class ClientServiceImpl implements ClienteService{

	//atributos
	@Autowired
	private ClienteRepository clienteRepository;
	
	
//	@Autowired
//	private CuentaRepository cuentaRepository;
	
	public ClientServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	// metodos
	@Override
	public ClienteDTO create(ClienteDTO clienteDTO) {
		Cliente cli1 = new Cliente(
				clienteDTO.getCodigo(),
				clienteDTO.getApellido(),
				clienteDTO.getNombre(),
				clienteDTO.getNumeroDeCuenta()
				);
		this.clienteRepository.save(cli1);
		return new ClienteDTO(cli1);
	}

	@Override
	public ClienteDTO finById(Long idCliente) {
		Cliente cliente = this.clienteRepository.findById(idCliente).orElse(null);
		ClienteDTO clienteDto = null;
		if(cliente !=null) {
			clienteDto = new ClienteDTO(cliente);
		}
		return clienteDto;
	}
	
	@Override
	public List<ClienteDTO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClienteDTO update(ClienteDTO clienteDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long idCliente) {
		// TODO Auto-generated method stub
		
	}

}
