/**
 * 
 */
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
import com.api.rest.service.ClientesService;

/**
 * @author juan.coria
 * @Version 1.0 11/24/2022
 * Controlador que manipula el flujo de los servicios rest del microservicio de clientes
 */

@RestController
@RequestMapping("/api")
public class ClientesController {

	@Autowired
	private ClientesService clientesServiceImpl;

	@GetMapping
	@RequestMapping(value = "clientes", method = RequestMethod.GET)
	public ResponseEntity<?> consultarClientes() {

		List<Cliente> clientesConsultados = this.clientesServiceImpl.consultarClientes();

		return ResponseEntity.ok(clientesConsultados);

	}
	
	@PostMapping
	@RequestMapping(value = "clientes/guardar", method = RequestMethod.POST)
	public ResponseEntity<?> guardarAnime(@RequestBody Cliente cliente){
		
		Cliente clienteGuardado = this.clientesServiceImpl.guardarCliente(cliente);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(clienteGuardado);
	}
	
	@PutMapping
	@RequestMapping(value = "clientes/actualizar", method = RequestMethod.PUT)
	public ResponseEntity<?> actualizarAnime(@RequestBody Cliente cliente){
		
		Cliente clienteActualizado = this.clientesServiceImpl.actualizarCliente(cliente);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(clienteActualizado);
	}
	
	@DeleteMapping
	@RequestMapping(value = "clientes/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> eliminarCliente(@PathVariable Long id){
		
		this.clientesServiceImpl.eliminarCliente(id);
		
		return ResponseEntity.ok().build();
	}

}
