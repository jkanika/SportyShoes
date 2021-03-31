package com.simplilearn.assessment.SportShoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.simplilearn.assessment.SportShoes.entity.Admin;
import com.simplilearn.assessment.SportShoes.exception.AdminIdNotFound;
import com.simplilearn.assessment.SportShoes.repository.AdminRepository;

@Controller
@SessionAttributes("AdminID")
public class AdminController {
	
	@Autowired
	private AdminRepository adminRepo;

	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model) {
		return "login";
	}
	
	// GET to admin page
	@PostMapping("/login")
	public String showAdminPage(ModelMap model,  @RequestParam String AdminID, @RequestParam String AdminPass) {
		List<Admin> admins = this.adminRepo.findAll();
		for (Admin admin : admins) {
			if(admin.getAdminID().equals(AdminID) && admin.getPass().equals(AdminPass)) {
				model.put("AID", AdminID);
				return "admin";
			}
			else {
				model.put("errorMessage", "Invalid Credentials");
	            return "login";
			}
		}
		throw new AdminIdNotFound("Admin Not Found with id " + AdminID);
	}
	
	@RequestMapping(value="/changepassword", method = RequestMethod.GET)
	public String showChangePassword(ModelMap model) {
		return "changepassword";
	}
	
	@PostMapping("/changepassword")
	public String changePassword(ModelMap model,  @RequestParam String ID, @RequestParam String newPassword) {
		List<Admin> admins = this.adminRepo.findAll();
		for (Admin admin : admins) {
			if(admin.getAdminID().equals(ID)) {
				admin.setPass(newPassword);
				this.adminRepo.save(admin);
				model.put("PasswordChanged", "Password Changed succsessfully!");
				return "login";
			}
			else {
				model.put("errorMessage", "Invalid Credentials");
	            return "login";
			}
		}
		throw new AdminIdNotFound("Admin Not Found with id " + ID);
	}
}
