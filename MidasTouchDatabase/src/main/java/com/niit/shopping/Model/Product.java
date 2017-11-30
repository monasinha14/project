package com.niit.shopping.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Component
@Table
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int prodId;
	private String prodName;
	private int prodPrice;
	private String prodCategory;
	private String prodDescp;
	@Transient 
	private MultipartFile prodimg;
	public MultipartFile getProdimg() {
		return prodimg;
	}

	public void setProdimg(MultipartFile prodimg) {
		this.prodimg = prodimg;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "catId",referencedColumnName="catId")
	private Category category;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "supId",referencedColumnName="supId")
	private Supplier supplier;
    
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(int prodPrice) {
		this.prodPrice = prodPrice;
	}

	public String getProdCategory() {
		return prodCategory;
	}

	public void setProdCategory(String prodCategory) {
		this.prodCategory = prodCategory;
	}

	public String getProdDescp() {
		return prodDescp;
	}

	public void setProdDescp(String prodDescp) {
		this.prodDescp = prodDescp;
	}

}
