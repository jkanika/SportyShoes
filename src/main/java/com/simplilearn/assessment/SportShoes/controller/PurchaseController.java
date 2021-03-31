package com.simplilearn.assessment.SportShoes.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.simplilearn.assessment.SportShoes.entity.Purchase;
import com.simplilearn.assessment.SportShoes.repository.PurchaseRepository;

@Controller
public class PurchaseController {
	
	@Autowired
	private PurchaseRepository PurchaseRepo;
	
	@RequestMapping("/purchasereport")
	public String showPurchaseReport(ModelMap model) {

			model.put("PurchaseReport",PurchaseRepo.findAll());
			return("purchasereport");
	}
	
	@PostMapping("/purchasereport")
	public String showPurchaseReportCategory(ModelMap model, @RequestParam String CategoryID) {
		long CatId = Long.parseLong(CategoryID);
		HashMap<Integer, String> mapPurchase = new HashMap<Integer, String>();
		int i=1;
		List<Purchase> purchases = PurchaseRepo.findAll();
		for (Purchase purchase : purchases) {
			if(purchase.getCategoryId() == CatId) {
				mapPurchase.put(i, purchase.toString());
				i++;
			}
		}
		if(mapPurchase.size() ==0) {
			model.put("puchaseerror", "No records found");
			return("purchasereport");
		}
		model.put("purchaseReportCat",mapPurchase);
		return("purchasereport");
	}
	
	@PostMapping("/purchasereports")
	public String showPurchaseReportDate(ModelMap model, @RequestParam String DateView) throws ParseException {
		HashMap<Integer, String> mapPurchase = new HashMap<Integer, String>();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		//System.out.println(DateView);
		int i=1;
		List<Purchase> purchases = PurchaseRepo.findAll();
		for (Purchase purchase : purchases) {
			String date2 = simpleDateFormat.format(purchase.getPurchaseDate());
			if(date2.equals(DateView)) {
				mapPurchase.put(i, purchase.toString());
				i++;
			}
		}
		if(mapPurchase.size() ==0) {
			model.put("puchaseerror", "No records found");
			return("purchasereport");
		}
		model.put("purchaseReportDate",mapPurchase);
		return("purchasereport");
	}
}