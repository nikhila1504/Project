package com.cts.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AddProduct {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String name,category,price;
	int stock;
	double discount;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public AddProduct(int id, String name, String category, double discount) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.discount = discount;
	}
	public AddProduct() {
		super();
	}
	public AddProduct(String price, int stock) {
		super();
		this.price = price;
		this.stock = stock;
	}
	
	
	

}
