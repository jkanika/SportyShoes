package com.simplilearn.assessment.SportShoes.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.simplilearn.assessment.SportShoes.entity.User;
import com.simplilearn.assessment.SportShoes.repository.UserRepository;

@Controller
public class UserController {

	@Autowired
	private UserRepository userRepo;
	
	
	@PostMapping("/user")
	public String showUserDetails(ModelMap model,  @RequestParam String UserId) {
		long id = Long.parseLong(UserId);
		if(id != 0) {
			//System.out.println(userRepo.findById(id));
			Optional<User> user = userRepo.findById(id);
			if(user.isEmpty()) {
				model.put("error","User Id doesn't exist");
				return("admin");
			}
			model.put("users",userRepo.findById(id));
			return("user");
		}
		else {
			//System.out.println(this.userRepo.findAll());
			model.put("users",this.userRepo.findAll());
			return("user");
		}
	}
}
