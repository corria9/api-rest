package com.api.rest.service;

import java.util.List;

import com.api.rest.entity.Cuenta;

public interface CuentasService {
	
	List <Cuenta> consultarCuentas();
	
	Cuenta guardarCuenta(Cuenta cuenta);
	
	Cuenta actualizarCuenta(Cuenta cuenta);

	void eliminarCuenta(Long id);

}
