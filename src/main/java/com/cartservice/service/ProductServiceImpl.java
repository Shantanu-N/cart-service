package com.cartservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cartservice.entity.Product;
import com.cartservice.exception.ProductNotFoundException;
import com.cartservice.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		List<Product> products=productRepository.findAll();
		if(products.isEmpty()) {
			throw new ProductNotFoundException("Products not added");
		}else {
			return products;
		}
	}

	@Override
	public Optional<Product> getProductById(Long productId) {
		// TODO Auto-generated method stub
		Optional<Product> product=productRepository.findById(productId);
		if(product.isPresent()) {
			return product;
		}else {
			throw new ProductNotFoundException("User not found with this ID - "+productId);
		}
	}

	@Override
	public Product createProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public Product updateProduct(Long productId, Product product) {
		// TODO Auto-generated method stub
		Optional<Product> existingProduct=productRepository.findById(productId);
		if(existingProduct.isPresent()) {
			Product p=existingProduct.get();
			p.setName(product.getName());
			p.setPrice(product.getPrice());
			p.setQuantity(product.getQuantity());
			return productRepository.save(p);
		}else {
			throw new ProductNotFoundException("User not found with this ID - "+productId);
		}
	}

	@Override
	public ResponseEntity<String> deleteProductById(Long productId) {
		// TODO Auto-generated method stub
		if (productRepository.existsById(productId)) {
			productRepository.deleteById(productId);
            return ResponseEntity.ok("User deleted successfully");
        } else {
            throw new ProductNotFoundException("User not found with this ID - "+productId);
        }
	}

}
