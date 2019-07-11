package com.crud.model;

import java.io.Serializable;

public class Auto implements Serializable {

	// Constantes
	private static final long serialVersionUID = 1L;
	
	// Atributos
	private String codigo;
	private String marca;
	private Integer anioDeFabricacion;
	

	
	// Get y Sets
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public Integer getAnioDeFabricacion() {
		return anioDeFabricacion;
	}
	public void setAnioDeFabricacion(Integer anioDeFabricacion) {
		this.anioDeFabricacion = anioDeFabricacion;
	}
	
}
