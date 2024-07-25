package com.cartservice.exception;

public class ProductNotFoundException extends RuntimeException{
	
	public ProductNotFoundException() {
		super("User not found");
	}
	
	public ProductNotFoundException(String message) {
		super(message);
	}
	
	

}
