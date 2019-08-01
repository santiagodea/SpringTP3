package com.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.crud.dto.FacturaDTO;
import com.crud.model.Cliente;
import com.crud.model.Factura;
import com.crud.repository.ClienteRepository;
import com.crud.repository.FacturaRepository;
import com.crud.repository.ProductoRepository;

public class FacturaServiceImpl implements FacturaService {

	private static final String rollback = null;

	//atributos
		@Autowired
		private FacturaRepository facturaRepository;
		
		@Autowired
		private ClienteRepository clienteRepository;

		@Autowired
		private ProductoRepository productoRepository;
	
	
	@Transactional(rollbackFor =  Exception.class)
	public FacturaDTO create(FacturaDTO facturaDTO) {
		Cliente cliente = null;
		Optional<Cliente> c = this.clienteRepository.findById(facturaDTO.getIdCliente());
		
		if (c.isPresent()){
		    cliente = c.get();   
		}
		else{
		   //mensaje de error como que no  encontro el  objeto de modelo. (siempre deberia estar, perooo)
		}
		
		Factura factura = new Factura(
				cliente,
				facturaDTO.getFecha(),
				facturaDTO.getNumero()
				);
		
		this.facturaRepository.save(factura);
		return new FacturaDTO(factura);
	}
	
	
	

	@Override
	public FacturaDTO finById(Long idFactura) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FacturaDTO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FacturaDTO update(FacturaDTO facturaDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long idFactura) {
		// TODO Auto-generated method stub

	}

}
