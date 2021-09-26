package com.factura.clientefacturas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "detalle")
public class Detalle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_detalle")
	private Long id_detalle;
	private Long id_factura;
	private Long id_producto;
	private Long cantida;
	private Long precio_total;

	/// COSTRUCTORE
	public Detalle(Long id_detalle, Long id_factura, Long id_producto, Long cantidad, Long precio_total) {

		this.id_detalle = id_detalle;
		this.id_factura = id_factura;
		this.id_producto = id_producto;
		this.cantida = cantidad;
		this.precio_total = precio_total;
	}

	public Detalle() {

	}

	// METODOS

	public Long getId_detalle() {
		return id_detalle;
	}

	public void setId_detalle(Long id_detalle) {
		this.id_detalle = id_detalle;
	}

	public Long getId_factura() {
		return id_factura;
	}

	public void setId_factura(Long id_factura) {
		this.id_factura = id_factura;
	}

	public Long getId_producto() {
		return id_producto;
	}

	public void setId_producto(Long id_producto) {
		this.id_producto = id_producto;
	}

	public Long getCantidad() {
		return cantida;
	}

	public void setCantidad(Long cantidad) {
		this.cantida = cantidad;
	}

	public Long getPrecio_total() {
		return precio_total;
	}

	public void setPrecio_total(Long precio_total) {
		this.precio_total = precio_total;
	}

}
