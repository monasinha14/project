package com.niit.shopping.Test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shopping.Dao.SupplierDAO;

import com.niit.shopping.Model.Supplier;

public class SuppilerTest {
	private static AnnotationConfigApplicationContext context;
	private static Supplier supplier;
	private static SupplierDAO supplierDAO;
	
	@BeforeClass
	public static void init(){
		context=new AnnotationConfigApplicationContext();
		context.scan("com.niit.shopping");
		
		supplier=(Supplier)context.getBean("supplier");
		supplierDAO=(SupplierDAO)context.getBean("supplierDAO");
	}
	@Test
	public void addSup(){
		supplier.setSupId(01);
		supplier.setSupName("Dell");
		supplier.setSupItem("Dell laptop");
		supplier.setSupContact(7895);
		supplier.setSupQuantity(78);
		
	}
}