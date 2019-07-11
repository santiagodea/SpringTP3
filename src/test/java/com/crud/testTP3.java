package com.crud;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.crud.model.Proveedor;
import com.crud.service.ProveedorService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CrudMarketApplication.class)
//@TestPropertySource(locations="classpath:test.properties")
public class testTP3 {
	
	@Autowired
	private ProveedorService proveedorService;

	@Test
	public void test() {
	
		Assert.assertEquals(true, true);

		Proveedor adidos = new Proveedor("aa11", "adidos");
		Proveedor nikee = new Proveedor("nn22", "nikee");
		Proveedor filas = new Proveedor("ff33", "filas");
		
		adidos = this.proveedorService.create(adidos);
		Assert.assertNotNull(adidos.getId());
		nikee = this.proveedorService.create(nikee);
		Assert.assertNotNull(nikee.getId());
		filas = this.proveedorService.create(filas);
		Assert.assertNotNull(filas.getId());
		
	}

}
