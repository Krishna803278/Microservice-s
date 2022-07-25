package com.mouritech.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mouritech.springboot.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	@Query("SELECT p FROM Product p WHERE " +

		   "p.name LIKE CONCAT('%',:query,'%')" + " Or p.description LIKE CONCAT('%',:query,'%')")
	List<Product> searchProdects(String query);

	@Query(value = "SELECT * FROM Products p WHERE " +

			     "p.name LIKE CONCAT('%',:query,'%')" + " Or p.description LIKE CONCAT('%',:query,'%')", nativeQuery = true)
	List<Product> searchProdectsSQL(String query);

}
