/**
 * 
 */
package com.api.rest.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * @author juan.coria
 * @Version 1.0 11/24/2022
 * Clase que representa entidades de Cliente
 */

@Data
@Entity
@Table(name = "cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id_cliente")
	private Long id_cliente;
	
	@Column(name ="fecha")
	private LocalDateTime fecha;
	
	@Column(name ="nombre")
	private String nombre;
	
	@Column(name ="direccion")
	private String direccion;
	
	@Column(name ="telefono")
	private Long telefono;
	
	@Column(name ="contrasenia")
	private Boolean contrasenia;
	

}
