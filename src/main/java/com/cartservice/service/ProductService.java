package com.cartservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.cartservice.entity.Product;

public interface ProductService {
	
	List<Product> getAllProduct();
	
	Optional<Product> getProductById(Long productId);
	
	Product createProduct(Product product);
	
	Product updateProduct(Long productId, Product product);
	
	ResponseEntity<String> deleteProductById(Long productId);
	

}
