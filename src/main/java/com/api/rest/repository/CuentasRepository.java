package com.api.rest.repository;

import org.springframework.data.repository.CrudRepository;

import com.api.rest.entity.Cuenta;

public interface CuentasRepository extends CrudRepository<Cuenta, Long> {

}
