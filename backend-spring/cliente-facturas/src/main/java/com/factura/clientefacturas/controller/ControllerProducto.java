package com.factura.clientefacturas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.factura.clientefacturas.dao.ProductoDAO;
import com.factura.clientefacturas.entity.Producto;

@RestController
@RequestMapping("api/producto")
public class ControllerProducto {

	@Autowired
	private ProductoDAO productoDao;

	@GetMapping
	public ResponseEntity<List<Producto>> getAllProductos() {
		List<Producto> listProductos = productoDao.findAll();
		return ResponseEntity.ok(listProductos);
	}

	@PostMapping
	public ResponseEntity<Producto> createProducto(@RequestBody Producto producto) {
		Producto newProducto = productoDao.save(producto);
		return ResponseEntity.ok(newProducto);

	}

}
