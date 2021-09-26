package com.factura.clientefacturas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.factura.clientefacturas.entity.Detalle;

public interface DetalleDAO extends JpaRepository<Detalle, Long> {

}
