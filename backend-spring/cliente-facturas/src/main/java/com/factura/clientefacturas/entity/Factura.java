package com.factura.clientefacturas.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "factura")
public class Factura {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_factura;
	private Long id_cliente;
	private String fecha;

	public Factura(Long id_factura, Long id_cliente, String fecha) {
		this.id_factura = id_factura;
		this.id_cliente = id_cliente;
		this.fecha = fecha;
	}

	public Factura() {

	}

	public Long getId_factura() {
		return id_factura;
	}

	public void setId_factura(Long id_factura) {
		this.id_factura = id_factura;
	}

	public Long getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

}
