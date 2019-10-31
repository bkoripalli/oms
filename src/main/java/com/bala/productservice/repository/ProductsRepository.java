package com.bala.productservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bala.productservice.domain.Product;

public interface ProductsRepository extends JpaRepository<Product, Long> {
}