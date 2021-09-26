package com.factura.clientefacturas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.factura.clientefacturas.entity.Factura;

public interface FacturaDao extends JpaRepository<Factura, Long> {

}
