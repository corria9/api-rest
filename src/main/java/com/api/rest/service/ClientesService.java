package com.api.rest.service;

import java.util.List;

import com.api.rest.entity.Cliente;

/**
 * @author juan.coria
 * @Version 1.0 11/24/2022
 * Interface que contine la logica de negocio para api de clientes
 */

public interface ClientesService {
	/**
	 * Metodo que permite consular un listado de clientes
	 * @return listado de clientes
	 */
	
	List<Cliente> consultarClientes();

}
