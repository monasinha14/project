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
public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int catId;
	private String catDescp;
	private String catName;
	public int getCatId() {
		return catId;
	}
	public void setCatId(int catId) {
		this.catId = catId;
	}
	public String getCatDescp() {
		return catDescp;
	}
	public void setCatDescp(String catDescp) {
		this.catDescp = catDescp;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
}
