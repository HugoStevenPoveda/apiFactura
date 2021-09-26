package com.factura.clientefacturas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.factura.clientefacturas.entity.Producto;

public interface ProductoDAO extends JpaRepository<Producto, Long> {

}
