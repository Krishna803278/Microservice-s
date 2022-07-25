package com.mouritech.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.springboot.entity.Product;
import com.mouritech.springboot.service.productServiceImpl;

@RestController
@RequestMapping("productsControler")
public class productsControler {
	
	@Autowired
	private productServiceImpl productServiceImpl;

	@GetMapping("search")
	public ResponseEntity<List<Product>> serchProduct(@RequestParam("query") String query) {
		return ResponseEntity.ok(productServiceImpl.serchProduct(query));

	}

	@PostMapping
	public ResponseEntity<Product> createProduct(@RequestBody Product product) {
		return ResponseEntity.ok(productServiceImpl.createProduct(product));

	}

}
