package com.factura.clientefacturas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.factura.clientefacturas.dao.ClienteDAO;
import com.factura.clientefacturas.entity.Cliente;

@RestController
@RequestMapping("api/cliente")
public class ControllerCliente {

	@Autowired
	private ClienteDAO clienteDao;

	@GetMapping
	public ResponseEntity<List<Cliente>> getAllClientes() {
		List<Cliente> listClientes = clienteDao.findAll();
		return ResponseEntity.ok(listClientes);

	}

	@PostMapping
	public ResponseEntity<Cliente> createCliente(@RequestBody Cliente cliente) {
		Cliente newCliente = clienteDao.save(cliente);
		return ResponseEntity.ok(newCliente);

	}

	@GetMapping("{id}")
	public ResponseEntity<Cliente> getClienteById(@PathVariable Long id) {
		if (clienteDao.findById(id).isPresent()) {

			return ResponseEntity.ok(clienteDao.findById(id).get());
		}

		return ResponseEntity.noContent().build();

	}

}
