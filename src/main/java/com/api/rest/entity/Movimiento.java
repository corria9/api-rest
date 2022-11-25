package com.api.rest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "movimientos")
public class Movimiento {
	
	
	
	public Movimiento(Long id_movimientos, Long numero_cuenta, String tipo, Float saldo_inicial, Boolean estado,
			String movimiento) {
		super();
		this.id_movimientos = id_movimientos;
		this.numero_cuenta = numero_cuenta;
		this.tipo = tipo;
		this.saldo_inicial = saldo_inicial;
		this.estado = estado;
		this.movimiento = movimiento;
	}
	
	public Movimiento(Long numero_cuenta, String tipo, Float saldo_inicial, Boolean estado,
			String movimiento) {
		super();
		this.numero_cuenta = numero_cuenta;
		this.tipo = tipo;
		this.saldo_inicial = saldo_inicial;
		this.estado = estado;
		this.movimiento = movimiento;
	}

	public Movimiento() {
		super();
		
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_movimientos")
	private Long id_movimientos;
	
	@Column(name = "numero_cuenta")
	private Long numero_cuenta;
	
	@Column(name = "tipo")
	private String tipo;
	
	@Column(name = "saldo_inicial")
	private Float saldo_inicial;
	
	@Column(name = "estado")
	private Boolean estado;
	
	@Column(name = "movimiento")
	private String movimiento;

	public Long getId_movimientos() {
		return id_movimientos;
	}

	public Long getNumero_cuenta() {
		return numero_cuenta;
	}

	public void setNumero_cuenta(Long numero_cuenta) {
		this.numero_cuenta = numero_cuenta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Float getSaldo_inicial() {
		return saldo_inicial;
	}

	public void setSaldo_inicial(Float saldo_inicial) {
		this.saldo_inicial = saldo_inicial;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public String getMovimiento() {
		return movimiento;
	}

	public void setMovimiento(String movimiento) {
		this.movimiento = movimiento;
	}

	public void setId_movimientos(Long id_movimientos) {
		this.id_movimientos = id_movimientos;
	}
	
	
	


}
