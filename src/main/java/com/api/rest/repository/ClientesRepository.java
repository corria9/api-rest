package com.api.rest.repository;

import org.springframework.data.repository.CrudRepository;

import com.api.rest.entity.Cliente;

/**
 * @author juan.coria
 * @Version 1.0 11/24/2022
 * Interface que contine el CRUD con Spring JPA para la tabla de clientes
 */


public interface ClientesRepository extends CrudRepository<Cliente, Long> {

}
