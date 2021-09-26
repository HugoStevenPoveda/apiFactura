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

import com.factura.clientefacturas.dao.DetalleDAO;
import com.factura.clientefacturas.entity.Detalle;

@RestController
@RequestMapping("detalles")
public class ControllerDetalle {

	@Autowired
	private DetalleDAO detalleDao;

	@GetMapping
	public ResponseEntity<List<Detalle>> getAllDetalles() {
		List<Detalle> listDetalle = detalleDao.findAll();

		return ResponseEntity.ok(listDetalle);

	}

	@PostMapping
	public ResponseEntity<Detalle> createDetalle(@RequestBody Detalle detalle) {
		Detalle newDetalle = detalleDao.save(detalle);
		return ResponseEntity.ok(newDetalle);

	}

	@GetMapping("{id}")
	public ResponseEntity<Detalle> getByIdDetalle(@PathVariable Long id) {

		if (detalleDao.findById(id).isPresent()) {
			return ResponseEntity.ok(detalleDao.findById(id).get());
		}
		return ResponseEntity.noContent().build();

	}

}
