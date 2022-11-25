package com.api.rest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * @author juan.coria
 * @Version 1.0 11/25/2022 Clase que representa entidades de Cuentas
 */

@Data
@Entity
@Table(name = "cuentas")
public class Cuenta {
	

	public Cuenta(Long id_cuenta, String numero_cuenta, String tipo, String saldo_inicial, String estado,
			String cliente) {
		super();
		this.id_cuenta = id_cuenta;
		this.numero_cuenta = numero_cuenta;
		this.tipo = tipo;
		this.saldo_inicial = saldo_inicial;
		this.estado = estado;
		this.cliente = cliente;
	}
	
	public Cuenta(String numero_cuenta, String tipo, String saldo_inicial, String estado,
			String cliente) {
		super();
		this.numero_cuenta = numero_cuenta;
		this.tipo = tipo;
		this.saldo_inicial = saldo_inicial;
		this.estado = estado;
		this.cliente = cliente;
	}
	
	public Cuenta() {
		super();
	}

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cuenta")
	private Long id_cuenta;
	
	@Column(name = "numero_cuenta")
	private String numero_cuenta;
	
	@Column(name = "tipo")
	private String tipo;
	
	@Column(name = "saldo_inicial")
	private String saldo_inicial;
	
	@Column(name = "estado")
	private String estado;
	
	@Column(name = "cliente")
	private String cliente;

	public Long getId_cuenta() {
		return id_cuenta;
	}

	public void setId_cuenta(Long id_cuenta) {
		this.id_cuenta = id_cuenta;
	}

	public String getNumero_cuenta() {
		return numero_cuenta;
	}

	public void setNumero_cuenta(String numero_cuenta) {
		this.numero_cuenta = numero_cuenta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getSaldo_inicial() {
		return saldo_inicial;
	}

	public void setSaldo_inicial(String saldo_inicial) {
		this.saldo_inicial = saldo_inicial;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

}
