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
import com.api.rest.entity.Movimiento;
import com.api.rest.service.MovimientosService;

@RestController
@RequestMapping("/api")
public class MovimientosController {
	
	@Autowired
	private MovimientosService movimientosServiceImpl;
	
	@GetMapping
	@RequestMapping(value = "movimientos", method = RequestMethod.GET)
	public ResponseEntity<?> consultarMovimientos(){
		
		List<Movimiento> movimientosConsultados = this.movimientosServiceImpl.consultarMovimiento();
		
		return ResponseEntity.ok(movimientosConsultados);
	}
	
	@PostMapping
	@RequestMapping(value = "movimientos/guardar", method = RequestMethod.POST)
	public ResponseEntity<?> guardarMovimiento(@RequestBody Movimiento movimiento){
		
		Movimiento movimientoGuardado = this.movimientosServiceImpl.guardarMovimiento(movimiento);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(movimientoGuardado);
	}
	
	@PutMapping
	@RequestMapping(value = "movimientos/actualizar", method = RequestMethod.PUT)
	public ResponseEntity<?> actualizarMovimiento(@RequestBody Movimiento movimiento){
		
		Movimiento movimientoActualizado = this.movimientosServiceImpl.actualizarMovimiento(movimiento);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(movimientoActualizado);
	}
	
	@DeleteMapping
	@RequestMapping(value = "movimientos/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> eliminarMovimiento(@PathVariable Long id){
		
		this.movimientosServiceImpl.eliminarMovimiento(id);
		
		return ResponseEntity.ok().build();
	}
	
}
