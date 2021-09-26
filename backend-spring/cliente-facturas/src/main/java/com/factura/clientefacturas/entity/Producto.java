package com.factura.clientefacturas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_producto;
	@Column(unique = true)
	private String nombre;

	private int precio;
	private int stock;

	// COSTRUCTORES

	public Producto(Long id_producto, String nombre, int precio, int stock) {
		this.id_producto = id_producto;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}

	public Producto() {

	}

	// METODOS

	public Long getId_producto() {
		return id_producto;
	}

	public void setId_producto(Long id_producto) {
		this.id_producto = id_producto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

}
