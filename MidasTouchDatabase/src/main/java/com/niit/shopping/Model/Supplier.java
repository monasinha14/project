package com.niit.shopping.Model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table
public class Supplier {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int supId;
	private String supName;
	private int supContact;
	private int supQuantity;
	private String supItem;
	
	public int getSupContact() {
		return supContact;
	}

	public void setSupContact(int supContact) {
		this.supContact = supContact;
	}

	public int getSupQuantity() {
		return supQuantity;
	}

	public void setSupQuantity(int supQuantity) {
		this.supQuantity = supQuantity;
	}

	
	public int getSupId() {
		return supId;
	}

	public void setSupId(int supId) {
		this.supId = supId;
	}

	public String getSupName() {
		return supName;
	}

	public void setSupName(String supName) {
		this.supName = supName;
	}

	
	

	public String getSupItem() {
		return supItem;
	}

	public void setSupItem(String supItem) {
		this.supItem = supItem;
	}

}
