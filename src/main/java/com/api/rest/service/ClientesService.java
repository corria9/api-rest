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
	 * @param id 
	 * @return listado de clientes
	 */
	
	List<Cliente> consultarClientes();
	/**
	 * Metodo que permite guardar un cliente
	 * @param cliente {@ Cliente} objeto cliente a guardar
	 * @return cliente guardado
	 */
	Cliente guardarCliente(Cliente cliente);
	/**
	 * Metodo que permite actualizar un cliente
	 * @param cliente {@ Cliente} objeto cliente a actualizar
	 * @return cliente actualizado
	 */
	Cliente actualizarCliente(Cliente cliente);
	/**
	 * Metodo que permite eliminar un cliente
	 * @param id {@ Long} objeto cliente a eliminar
	 * @return cliente eliminado
	 */
	void eliminarCliente(Long id);

}
