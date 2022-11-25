/**
 * 
 */
package com.api.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
@RequestMapping("/clientes")
public class ClientesController {
	
	@Autowired
	private ClientesService clienteServiceImpl;
	
	@GetMapping
	@RequestMapping(value = "consultarClientes", method = RequestMethod.GET)
	public ResponseEntity<?> consultarClientes(){
		
		List<Cliente> clientesConsultados = this.clienteServiceImpl.consultarClientes();
		
		return ResponseEntity.ok(clientesConsultados);
		
	}

}
