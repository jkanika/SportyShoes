package com.simplilearn.assessment.SportShoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.assessment.SportShoes.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
