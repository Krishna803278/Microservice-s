package com.mouritech.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mouritech.springboot.entity.Product;
import com.mouritech.springboot.repository.ProductRepository;
@Service
public class productServiceImpl implements productsService {
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> serchProduct(String query) {
		
		return productRepository.searchProdects(query);
	}

	@Override
	public Product createProduct(Product product) {
		
		return productRepository.save(product);
	}

}
