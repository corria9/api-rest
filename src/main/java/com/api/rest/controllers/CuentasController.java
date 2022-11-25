package com.api.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.rest.entity.Cuenta;
import com.api.rest.service.CuentasService;

@RestController
@RequestMapping("/api")
public class CuentasController {
	
	@Autowired
	private CuentasService cuentasServiceImpl;
	
	@GetMapping
	@RequestMapping(value = "cuentas", method = RequestMethod.GET)
	public ResponseEntity<?> consultarCuentas() {
		
		List<Cuenta> cuentasConsultadas = this.cuentasServiceImpl.consultarCuentas();

		return ResponseEntity.ok(cuentasConsultadas);
		
	}
	
}
