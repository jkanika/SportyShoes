package com.simplilearn.assessment.SportShoes.entity;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Purchase {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long PurchaseId;
	
	@Column
	private int PurchaseQty;
	
	@Column
	private float PurchaseTotal;
	
	@Column
	private Date PurchaseDate;
	
	@Column
	private long CategoryId;

	public Purchase() {}
	
	public Purchase(int purchaseQty, float purchaseTotal, Date purchaseDate, long categoryId) {
		PurchaseQty = purchaseQty;
		PurchaseTotal = purchaseTotal;
		PurchaseDate = purchaseDate;
		CategoryId = categoryId;
	}

	public long getPurchaseId() {
		return PurchaseId;
	}

	public void setPurchaseId(long purchaseId) {
		PurchaseId = purchaseId;
	}

	public int getPurchaseQty() {
		return PurchaseQty;
	}

	public void setPurchaseQty(int purchaseQty) {
		PurchaseQty = purchaseQty;
	}

	public float getPurchaseTotal() {
		return PurchaseTotal;
	}

	public void setPurchaseTotal(float purchaseTotal) {
		PurchaseTotal = purchaseTotal;
	}

	public Date getPurchaseDate() {
		return PurchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		PurchaseDate = purchaseDate;
	}

	public long getCategoryId() {
		return CategoryId;
	}

	public void setCategoryId(long categoryId) {
		CategoryId = categoryId;
	}

	@Override
	public String toString() {
		return "Purchase [PurchaseId=" + PurchaseId + ", PurchaseQty=" + PurchaseQty + ", PurchaseTotal="
				+ PurchaseTotal + ", PurchaseDate=" + PurchaseDate + ", CategoryId=" + CategoryId + "]\n";
	}
	
	
}
