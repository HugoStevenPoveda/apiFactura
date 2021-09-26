package com.factura.clientefacturas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.factura.clientefacturas.entity.Cliente;

public interface ClienteDAO extends JpaRepository<Cliente, Long> {

}
