package com.mouritech.springboot.service;

import java.util.List;

import com.mouritech.springboot.entity.Product;

public interface productsService {

	List<Product>serchProduct (String query);
	Product createProduct (Product product);
}
