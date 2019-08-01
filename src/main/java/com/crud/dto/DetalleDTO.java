package com.crud.dto;

import com.crud.model.Detalle;

public class DetalleDTO {
	private Long id;
	private Long idFactura;
	private Long idProducto;
	private Long cantidad;
	
	public DetalleDTO(Long idFactura,Long idProducto, Long cantidad) {
		super();
		this.idFactura = idFactura;
		this.idProducto = idProducto;
		this.cantidad = cantidad;
	}
	
	public DetalleDTO(Detalle detalle) {
		this(detalle.getFactura().getId(), detalle.getProducto().getId(), detalle.getCantidad());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public Long getCantidad() {
		return cantidad;
	}

	public void setCantidad(Long cantidad) {
		this.cantidad = cantidad;
	}

	public Long getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(Long idFactura) {
		this.idFactura = idFactura;
	}
	
	
	
}
