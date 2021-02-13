package com.djlearn.product.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.djlearn.product.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
