package com.crud.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crud.model.Auto;


@RestController
@RequestMapping("/api")
public class MarketRestController {

	// Atributos
	private List<Auto> autos;
	
	// Cosntructor
	public MarketRestController() {
		super();
		this.autos = new ArrayList<Auto>();
	}
	
	// Metodos
	@RequestMapping(method=RequestMethod.POST)
	public Auto crearAuto(@RequestBody Auto nuevo) {
		this.autos.add(nuevo);
		return nuevo;
	}
	
	@RequestMapping(value="/findAll", method=RequestMethod.GET)
	public List<Auto> findAll(){
		return this.autos;
	}

	@RequestMapping(value="/findByCodigo/{codigo}", method=RequestMethod.GET)
	public Auto findByCodigo(@PathVariable("codigo") String codigo){
		return this.autos.stream().filter( a-> a.getCodigo().equals(codigo)).findAny().orElse(null);
	}

}
