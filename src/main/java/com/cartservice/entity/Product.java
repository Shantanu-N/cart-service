package com.cartservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productId;
	private String name;
	private double price;
	private int quantity;
	
	public Product() {
		
	}
	
	public Product(Long productId,String name, double price, int quantity) {
		this.productId=productId;
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	
	public Long getId() {
		return productId;
	}
	
	public void setId(Long productId) {
		this.productId=productId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price=price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", price=" + price + ", quantity=" + quantity
				+ "]";
	}
	
	

}
