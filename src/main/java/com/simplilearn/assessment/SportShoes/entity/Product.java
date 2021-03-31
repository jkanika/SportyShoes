package com.simplilearn.assessment.SportShoes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long PID;
	
	@Column
	private long CategoryId;
	
	@Column
	private String PName;
		
	@Column
	private float PPrice;
	
	@Column
	private String SellerName;
	
	public Product() {}
	
	public Product(long categoryId, String pName, float pPrice, String sellerName) {
		CategoryId = categoryId;
		PName = pName;
		PPrice = pPrice;
		SellerName = sellerName;
	}

	public long getPID() {
		return PID;
	}

	public void setPID(long pID) {
		PID = pID;
	}

	public long getCategoryId() {
		return CategoryId;
	}

	public void setCategoryId(long categoryId) {
		CategoryId = categoryId;
	}

	public String getPName() {
		return PName;
	}

	public void setPName(String pName) {
		PName = pName;
	}

	public float getPPrice() {
		return PPrice;
	}

	public void setPPrice(float pPrice) {
		PPrice = pPrice;
	}

	public String getSellerName() {
		return SellerName;
	}

	public void setSellerName(String sellerName) {
		SellerName = sellerName;
	}

	@Override
	public String toString() {
		return "Product [PID=" + PID + ", CategoryId=" + CategoryId + ", PName=" + PName + ", PPrice=" + PPrice
				+ ", SellerName=" + SellerName + "]\n";
	}
	
}
