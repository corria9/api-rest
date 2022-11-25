package com.api.rest.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.rest.entity.Movimiento;
import com.api.rest.repository.MovimientosRepository;
import com.api.rest.service.MovimientosService;

@Service
public class MovimientosServiceImpl implements MovimientosService {
	
	@Autowired
	private MovimientosRepository movimientosRepository;

	@Override
	public List<Movimiento> consultarMovimiento() {
		
		List<Movimiento> movimientosDataSource = StreamSupport.stream(
				this.movimientosRepository.findAll().spliterator(), false)
				.collect(Collectors.toList());
		
		return movimientosDataSource;
	}

	@Override
	public Movimiento guardarMovimiento(Movimiento movimiento) {
		return this.movimientosRepository.save(movimiento);
	}

	@Override
	public Movimiento actualizarMovimiento(Movimiento movimiento) {
		return this.movimientosRepository.save(movimiento);
	}

	@Override
	public void eliminarMovimiento(Long id) {
		this.movimientosRepository.deleteById(id);
		
	}

}
