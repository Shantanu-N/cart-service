package com.cartservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cartservice.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
