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
	
	@Test
	public void add_product(){
		//Category category=new Category();
		//category.setCatId(1);
		//Supplier suppiler=new Supplier();
		//suppiler.setSupId(1);
		//product.setProdId(7);
		product.setProdName("samsung");
		product.setProdDescp("j2 ");
		product.setProdPrice(7000);
		product.setProdCategory("1");
		//product.setSupplier(suppiler);
		//product.setCategory(category);
		assertNotNull(productDAO.add_product(product));
		 
	}
	@Ignore
	@Test
	public void getproductby_id(){

		Product product= productDAO.getproductby_Id(2);
		assertNotNull(product);
		assertEquals(2, product.getProdId());
		
		
	}

	@Ignore
	@Test
	public void getAllproduct(){
		List<Product> list=productDAO.getlist_product();
		assertEquals(2,list.size());
		for(Product prod:list){
			System.out.println(prod.getProdId()+""+prod.getProdName());
		}
	}
}