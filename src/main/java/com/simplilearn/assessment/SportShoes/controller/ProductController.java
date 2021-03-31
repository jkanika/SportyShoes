package com.simplilearn.assessment.SportShoes.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simplilearn.assessment.SportShoes.entity.Admin;
import com.simplilearn.assessment.SportShoes.entity.Product;
import com.simplilearn.assessment.SportShoes.exception.AdminIdNotFound;
import com.simplilearn.assessment.SportShoes.repository.ProductRepository;

@Controller
public class ProductController {

	@Autowired
	private ProductRepository ProductRepo;
	
	@GetMapping("/products")
	public String showProductDetails(ModelMap model,  @RequestParam String ProductId) {
		long id = Long.parseLong(ProductId);
		if(id != 0) {
			//System.out.println(userRepo.findById(id));
			Optional<Product> product = ProductRepo.findById(id);
			if(product.isEmpty()) {
				model.put("errorMessage", "Invalid ProductId");
	            return "admin";
			}
			model.put("product",ProductRepo.findById(id));
			return("products");
		}
		else {
			//System.out.println(this.userRepo.findAll());
			model.put("product",this.ProductRepo.findAll());
			return("products");
		}
	}
	
	@RequestMapping(value="/changecategory", method = RequestMethod.GET)
	public String showChangeCategory(ModelMap model) {
		return "changecategory";
	}
	
	@PostMapping("/changecategory")
	public String changeCategory(ModelMap model,  @RequestParam long ProductId, @RequestParam long CategoryId) {
		List<Product> products = this.ProductRepo.findAll();
		for (Product product : products) {
			if(product.getPID()==(ProductId)) {
				product.setCategoryId(CategoryId);
				this.ProductRepo.save(product);
				model.put("CategoryChanged", "Product category Changed succsessfully!");
				return "admin";
			}
			else {
				model.put("errorMessage", "Invalid ProductId");
	            return "products";
			}
		}
		throw new AdminIdNotFound("Admin Not Found with id " + ProductId);
	}
}
