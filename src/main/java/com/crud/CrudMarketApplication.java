package com.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {
						"ar.com.ciu.persistencia.market.model",
						"ar.com.ciu.persistencia.market.service",
						"ar.com.ciu.persistencia.market.repository",
						"ar.com.ciu.persistencia.market.controller"
						})

public class CrudMarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudMarketApplication.class, args);
	}

}

