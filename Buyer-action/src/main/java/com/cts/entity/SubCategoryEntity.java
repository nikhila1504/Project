package com.cts.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="SubCategory")
public class SubCategoryEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="sId")
	private int subCategoryId;
	@Column(name="sName")
	private String subCategoryName;
	@Column(name="cId")
	private int categoryId;
	@OneToMany
	List<ProductsEntity> products;
	public SubCategoryEntity() {
		
	}
	public SubCategoryEntity(int subCategoryId, String subCategoryName, int categoryId, List<ProductsEntity> products) {
		super();
		this.subCategoryId = subCategoryId;
		this.subCategoryName = subCategoryName;
		this.categoryId = categoryId;
		this.products = products;
	}





	public List<ProductsEntity> getProducts() {
		return products;
	}





	public void setProducts(List<ProductsEntity> products) {
		this.products = products;
	}





	public int getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(int subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public String getSubCategoryName() {
		return subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

}
