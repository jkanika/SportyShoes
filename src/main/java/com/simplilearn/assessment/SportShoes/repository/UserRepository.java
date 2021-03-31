package com.simplilearn.assessment.SportShoes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.assessment.SportShoes.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
