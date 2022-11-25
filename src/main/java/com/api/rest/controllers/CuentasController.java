package com.api.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.rest.entity.Cliente;
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
	
	@PostMapping
	@RequestMapping(value = "cuentas/guardar", method = RequestMethod.POST)
	public ResponseEntity<?> guardarCuenta(@RequestBody Cuenta cuenta){
		
		Cuenta cuentaGuardada = this.cuentasServiceImpl.guardarCuenta(cuenta);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(cuentaGuardada);
	}
	
	@PutMapping
	@RequestMapping(value = "cuentas/actualizar", method = RequestMethod.PUT)
	public ResponseEntity<?> actualizarCuenta(@RequestBody Cuenta cuentas){
		
		Cuenta cuentaActualizada = this.cuentasServiceImpl.actualizarCuenta(cuentas);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(cuentaActualizada);
	}
	
	@DeleteMapping
	@RequestMapping(value = "cuentas/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> eliminarCuenta(@PathVariable Long id){
		
		this.cuentasServiceImpl.eliminarCuenta(id);
		
		return ResponseEntity.ok().build();
	}
}
