package com.crud;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import com.crud.model.Congelado;
import com.crud.model.Frio;
import com.crud.model.General;
import com.crud.model.Gondola;
import com.crud.model.Producto;
import com.crud.model.Proveedor;
import com.crud.service.ProductoService;
import com.crud.service.ProveedorService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CrudMarketApplication.class)
@TestPropertySource(locations="classpath:test.properties")
public class TestTP3 {
	
	@Autowired
	private ProveedorService proveedorService;
	
	@Autowired
	private ProductoService productoService;

	
	@Test
	public void testProvedores() {
		Proveedor adidos = new Proveedor("aa11", "adidos");
		Proveedor nikee = new Proveedor("nn22", "nikee");
		Proveedor filas = new Proveedor("ff33", "filas");
		
		adidos = this.proveedorService.create(adidos);
		Assert.assertNotNull(adidos.getId());
		nikee = this.proveedorService.create(nikee);
		Assert.assertNotNull(nikee.getId());
		filas = this.proveedorService.create(filas);
		Assert.assertNotNull(filas.getId());
		
		Producto remera = new General("rr11", "remera", adidos, 170);
		Producto agua = new Frio("ff22", "agua", nikee,5,20,LocalDate.now());
		Producto gorra = new Gondola("gg33", "gorra", adidos, 200.00,  LocalDate.now());
		Producto energizante = new Congelado("ee44", "filas", filas, LocalDate.now());
		
		remera = this.productoService.create(remera);
		remera.actualizarPrecio(1700);
		Assert.assertNotNull(remera.getId());
		agua = this.productoService.create(agua);
		agua.actualizarPrecio(50);
		Assert.assertNotNull(agua.getId());
		gorra = this.productoService.create(gorra);
		gorra.actualizarPrecio(560);
		Assert.assertNotNull(gorra.getId());
		energizante = this.productoService.create(energizante);
		energizante.actualizarPrecio(170);
		Assert.assertNotNull(energizante.getId());
		
		
		
		
	}
	@Test
	public void testProductos() {

		
		
		
	}
}
