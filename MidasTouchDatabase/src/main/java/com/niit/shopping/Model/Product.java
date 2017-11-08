package com.niit.shopping.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private int prodId;
	private String prodName;
	private  int prodPrice;
	private  String prodCategory;
	private  String prodDescp;
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
