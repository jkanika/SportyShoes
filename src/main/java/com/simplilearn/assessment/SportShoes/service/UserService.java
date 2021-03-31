package com.simplilearn.assessment.SportShoes.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.simplilearn.assessment.SportShoes.entity.User;
import com.simplilearn.assessment.SportShoes.exception.AdminIdNotFound;
import com.simplilearn.assessment.SportShoes.repository.UserRepository;

@Transactional
@Service
public class UserService {
	
	private UserRepository userRepo;
	
	public Iterable<User> findAll(){
		return this.userRepo.findAll();
	}

	public User findById(long id) {
		return this.userRepo.findById(id).orElseThrow(()->{
			throw new AdminIdNotFound("Exception occured");
		});
	}
}
