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
@Table(name="Categories")
public class CategoryEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cId")
	private int categoryId;
	@Column(name="cName")
	private String categoryName;
	@Column(name="gstPer")
	private int gstPercentage;
	@OneToMany
	List<SubCategoryEntity> subcatergory;
	
	public CategoryEntity() {
		
	}
	
	public CategoryEntity(int categoryId, String categoryName, int gstPercentage,
			List<SubCategoryEntity> subcatergory) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.gstPercentage = gstPercentage;
		this.subcatergory = subcatergory;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public int getGstPercentage() {
		return gstPercentage;
	}

	public void setGstPercentage(int gstPercentage) {
		this.gstPercentage = gstPercentage;
	}

	public List<SubCategoryEntity> getSubcatergory() {
		return subcatergory;
	}

	public void setSubcatergory(List<SubCategoryEntity> subcatergory) {
		this.subcatergory = subcatergory;
	}
	
}
