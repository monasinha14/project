package com.niit.shopping.Test;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shopping.Dao.ProductDAO;
import com.niit.shopping.Model.Category;
import com.niit.shopping.Model.Product;

public class ProductTest {
	
	private static AnnotationConfigApplicationContext context;
	private static ProductDAO productDAO;
	private static Product product;
	
	@BeforeClass
	public static void init(){
		
		context=new AnnotationConfigApplicationContext();
		context.scan("com.niit.shopping");
		context.refresh();
		product=(Product)context.getBean("product");
		productDAO=(ProductDAO)context.getBean("productDAO");
	}
	@Ignore
	@Test
	public void add_product(){
		
		product.setProdId(521);
		product.setProdName("samsung");
		product.setProdDescp("j2 ");
		product.setProdPrice(7000);
		product.setProdCategory("MOBILe");
		assertEquals(true,productDAO.add_product(product));
		 
	}
	@Test
	public void getproductby_id(){

		Product product= productDAO.getproductby_Id(1);
		assertNotNull(product);
		assertEquals(1, product.getProdId());
		
		
	}

	@Ignore
	@Test
	public void getAllproduct(){
		List<Product> list=productDAO.getlist_product();
		assertEquals(7,list.size());
		for(Product prod:list){
			System.out.println(prod.getProdId()+""+prod.getProdName());
		}
		 
	}
 
}
