package com.api.rest.service;

import java.util.List;

import com.api.rest.entity.Movimiento;

public interface MovimientosService {
	
	List<Movimiento> consultarMovimiento();
	
	Movimiento guardarMovimiento(Movimiento movimiento);
	
	Movimiento actualizarMovimiento(Movimiento movimiento);
	
	void eliminarMovimiento(Long id);

}
