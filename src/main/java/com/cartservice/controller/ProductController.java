package com.cartservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cartservice.entity.Product;
import com.cartservice.service.ProductService;

@RestController
@RequestMapping("/api/v1")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/getAll")
	public List<Product> getAllProduct(){
		return productService.getAllProduct();
	}
	
	@PostMapping("/create")
	public Product createProduct(@RequestBody Product product) {
		return productService.createProduct(product);
	}
	
	@GetMapping("/get/{productId}")
	public Optional<Product> getProductById(@PathVariable Long productId) {
		return productService.getProductById(productId);
	}
	
	@PutMapping("/update/{productId}")
	public Product updateProduct(@PathVariable Long productId,@RequestBody Product product) {
		return productService.updateProduct(productId, product);
	}
	
	@DeleteMapping("/delete/{productId}")
	public ResponseEntity<String> deleteProductById(@PathVariable Long productId){
		return productService.deleteProductById(productId);
	}
	
	

}
