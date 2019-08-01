package com.crud.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import com.crud.model.Detalle;
import com.crud.model.Factura;

public class FacturaDTO {
	private Long id;
	private Long idCliente;
	private LocalDate fecha;
	private Long numero;
	private List<DetalleDTO> detallesDTO;
	
	public FacturaDTO(Long idCliente, LocalDate fecha, Long numero, List<DetalleDTO> detallesDTO) {
		super();
		this.idCliente = idCliente;
		this.fecha = fecha;
		this.numero = numero;
		this.detallesDTO = detallesDTO;
	}
	
	public FacturaDTO(Factura factura) {
		this(factura.getCliente().getId(), factura.getFecha(), factura.getNumero(), pasarADetalleDTO(factura.getDetalles()));
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public List<DetalleDTO> getDetallesDTO() {
		return detallesDTO;
	}

	public void setDetallesDTO(List<DetalleDTO> detallesDTO) {
		this.detallesDTO = detallesDTO;
	}
	
	public static List<DetalleDTO> pasarADetalleDTO(List<Detalle> detalles) {
		return detalles.stream().map(d -> new DetalleDTO(d)).collect(Collectors.toList());
	}	
}
