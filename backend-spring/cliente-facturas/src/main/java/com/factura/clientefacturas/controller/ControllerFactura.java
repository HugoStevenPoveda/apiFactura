package com.factura.clientefacturas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.factura.clientefacturas.dao.FacturaDao;
import com.factura.clientefacturas.entity.Factura;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/facturas")
public class ControllerFactura {
	@Autowired
	private FacturaDao facturaDao;

	@GetMapping
	public ResponseEntity<List<Factura>> getAllfacturas() {
		List<Factura> listFactura = facturaDao.findAll();
		return ResponseEntity.ok(listFactura);

	}

	@PostMapping
	public ResponseEntity<Factura> createFactura(@RequestBody Factura factura) {
		Factura newFactura = facturaDao.save(factura);
		return ResponseEntity.ok(newFactura);

	}

	@GetMapping("{id}")
	public ResponseEntity<Factura> getByIdFactura(@PathVariable Long id) {
		if (facturaDao.findById(id).isPresent()) {
			return ResponseEntity.ok(facturaDao.findById(id).get());
		}

		return ResponseEntity.noContent().build();

	}

}
