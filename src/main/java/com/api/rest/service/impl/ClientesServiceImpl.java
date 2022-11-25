/**
 * 
 */
package com.api.rest.service.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.rest.entity.Cliente;
import com.api.rest.repository.ClientesRepository;
import com.api.rest.service.ClientesService;

/**
 * @author juan.coria
 *Clase que implementa los metodos de logica de negocio de la interfaz de ClienteService
 */
@Service
public class ClientesServiceImpl implements ClientesService {
	/**
	 * Bean Repository de spring inyectado para ejecutar el CRUD
	 */
	
	@Autowired
	private ClientesRepository clientesRepository;
	
	public List<Cliente> consultarClientes() {
		
		List<Cliente> clientesDataSource = StreamSupport.stream(
				this.clientesRepository.findAll().spliterator(), false)
				.collect(Collectors.toList());
		
		return clientesDataSource;
	}

	@Override
	public Cliente guardarCliente(Cliente cliente) {
		cliente.setFecha(LocalDateTime.now());
		
		return this.clientesRepository.save(cliente);
	}

	@Override
	public Cliente actualizarCliente(Cliente cliente) {
		return this.clientesRepository.save(cliente);
	}

	@Override
	public void eliminarCliente(Long id) {
		this.clientesRepository.deleteById(id);		
	}

}
