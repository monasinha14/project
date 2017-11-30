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
import com.niit.shopping.Model.Supplier;

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
		//Category category=new Category();
		//category.setCatId(1);
		//Supplier suppiler=new Supplier();
		//suppiler.setSupId(1);
		product.setProdId(2);
		product.setProdName("Laptop");
		product.setProdDescp("thinkpad");
		product.setProdPrice(4760);
		product.setProdCategory("1");
		//product.setSupplier(suppiler);
		//product.setCategory(category);
		assertEquals(true,productDAO.add_product(product));
		 
	}
	@Ignore
	@Test
	public void getproductby_id(){

		Product product= productDAO.getproductby_Id(1);
		assertNotNull(product);
		assertEquals(1, product.getProdId());
		
		
	}
	
	@Test
	public void updateproduct(){
		Product product=productDAO.getproductby_Id(2);
		product.setProdPrice(8000);
		
		assertEquals(true,productDAO.update_product(product));
	}
	@Ignore
	@Test
	public void deleteproduct(){
		Product product=productDAO.getproductby_Id(1);
		assertEquals(true,productDAO.delete_product(product));
	}

	@Ignore
	@Test
	public void getAllproduct(){
		List<Product> list=productDAO.getlist_product();
		assertEquals(1,list.size());
		for(Product prod:list){
			System.out.println(prod.getProdId()+""+prod.getProdName());
		}
	}
}