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
public class Supplier {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public String supId;
	public String getSupId() {
		return supId;
	}
	public void setSupId(String supId) {
		this.supId = supId;
	}
	public String getSupName() {
		return supName;
	}
	public void setSupName(String supName) {
		this.supName = supName;
	}
	public String getSupContact() {
		return supContact;
	}
	public void setSupContact(String supContact) {
		this.supContact = supContact;
	}
	public String getSupQuantity() {
		return supQuantity;
	}
	public void setSupQuantity(String supQuantity) {
		this.supQuantity = supQuantity;
	}
	public String supName;
	public String supContact;
	public String supQuantity;
	public String supItem;
	public String getSupItem() {
		return supItem;
	}
	public void setSupItem(String supItem) {
		this.supItem = supItem;
	}
	

}
