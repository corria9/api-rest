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
 * @Version 1.0 11/24/2022 Clase que representa entidades de Cliente
 */

@Data
@Entity
@Table(name = "cliente")
public class Cliente {

	public Cliente(Long id_cliente, LocalDateTime fecha, String nombre, String direccion, Long telefono,
			Boolean contrasenia) {
		super();
		this.id_cliente = id_cliente;
		this.fecha = fecha;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.contrasenia = contrasenia;
	}
	
	public Cliente(LocalDateTime fecha, String nombre, String direccion, Long telefono,
			Boolean contrasenia) {
		super();
		this.fecha = fecha;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.contrasenia = contrasenia;
	}
	
	public Cliente() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cliente")
	private Long id_cliente;

	@Column(name = "fecha")
	private LocalDateTime fecha;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "direccion")
	private String direccion;

	@Column(name = "telefono")
	private Long telefono;

	@Column(name = "contrasenia")
	private Boolean contrasenia;

	public Long getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Long getTelefono() {
		return telefono;
	}

	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}

	public Boolean getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(Boolean contrasenia) {
		this.contrasenia = contrasenia;
	}


}
