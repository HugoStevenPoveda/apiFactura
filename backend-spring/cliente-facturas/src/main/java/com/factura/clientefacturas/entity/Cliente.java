package com.factura.clientefacturas.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id_cliente;

	private String nombre;

	private String apellido;

	private String direccion;

	private String fecha_nacimento;

	private Long telefono;

	@Column(unique = true)
	private String email;

	// CONSTRUCTOR
	public Cliente(Long id_cliente, String nombre, String apellido, String direccion, String fecha_nacimento,
			Long telefono, String email) {
		super();
		this.id_cliente = id_cliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.fecha_nacimento = fecha_nacimento;
		this.telefono = telefono;
		this.email = email;
	}

	public Cliente() {

	}

	// METODOS

	public Long getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getFecha_nacimento() {
		return fecha_nacimento;
	}

	public void setFecha_nacimento(String fecha_nacimento) {
		this.fecha_nacimento = fecha_nacimento;
	}

	public Long getTelefono() {
		return telefono;
	}

	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
