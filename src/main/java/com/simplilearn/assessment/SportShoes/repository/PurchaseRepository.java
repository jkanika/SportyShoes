package com.simplilearn.assessment.SportShoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.assessment.SportShoes.entity.Purchase;

public interface PurchaseRepository extends JpaRepository<Purchase, Long>{

}
