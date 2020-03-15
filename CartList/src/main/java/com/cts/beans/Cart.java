package com.cts.beans;

import javax.persistence.Table;
@Table(name="cart")
public class Cart {
	
	int itemid;
	double itemPrice;
	int quantity;
	public Cart(int itemid, double itemPrice, int quantity) {
		super();
		this.itemid = itemid;
		this.itemPrice = itemPrice;
		this.quantity = quantity;
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
