package com.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.crud.dto.DetalleDTO;
import com.crud.model.Detalle;
import com.crud.model.Factura;
import com.crud.model.Producto;
import com.crud.repository.ClienteRepository;
import com.crud.repository.DetalleRepository;
import com.crud.repository.FacturaRepository;
import com.crud.repository.ProductoRepository;

public class DetalleServiceImpl implements DetalleService {

	// atributos
	@Autowired
	private DetalleRepository detalleRepository;

	@Autowired
	private FacturaRepository facturaRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private ProductoRepository productoRepository;

	@Transactional(rollbackFor = Exception.class)
	public DetalleDTO create(DetalleDTO detalleDTO) {
		Factura factura = null;
		Producto producto = null;

		Optional<Factura> f = this.facturaRepository.findById(detalleDTO.getIdFactura());

		if (f.isPresent()) {
			factura = f.get();
		} else {
			// mensaje de error como que no encontro el objeto de modelo. (siempre deberia
			// estar, perooo)
		}

		Optional<Producto> p = this.productoRepository.findById(detalleDTO.getIdProducto());

		if (p.isPresent()) {
			producto = p.get();
		} else {
			// mensaje de error como que no encontro el objeto de modelo. (siempre deberia
			// estar, perooo)
		}
		
		//foreach detalleDTO.getProductosDTO...
	    //	Producto p = this.productoRepository.getById( prodDto.getId() )

		Detalle detalle = new Detalle(factura, producto, detalleDTO.getCantidad());

		this.detalleRepository.save(detalle);
		return new DetalleDTO(detalle);
	}

	@Override
	public DetalleDTO finById(Long idDetalle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DetalleDTO> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DetalleDTO update(DetalleDTO detalleDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long idDetalle) {
		// TODO Auto-generated method stub

	}

}
