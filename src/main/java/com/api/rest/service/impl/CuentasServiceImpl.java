package com.api.rest.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.rest.entity.Cuenta;
import com.api.rest.repository.CuentasRepository;
import com.api.rest.service.CuentasService;

@Service
public class CuentasServiceImpl implements CuentasService {
	
	@Autowired
	private CuentasRepository cuentasRepository;

	@Override
	public List<Cuenta> consultarCuentas() {
		
		List<Cuenta> cuentasDataSource = StreamSupport.stream(
				this.cuentasRepository.findAll().spliterator(), false)
				.collect(Collectors.toList());
		
		return cuentasDataSource;
	}

	@Override
	public Cuenta guardarCuenta(Cuenta cuenta) {
		
		return this.cuentasRepository.save(cuenta);
	}

	@Override
	public Cuenta actualizarCuenta(Cuenta cuenta) {
		
		return this.cuentasRepository.save(cuenta);
	}

	@Override
	public void eliminarCuenta(Long id) {
		this.cuentasRepository.deleteById(id);
		
	}

}
