package com.niit.shopping.Test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shopping.Dao.CategoryDAO;
import com.niit.shopping.Model.Category;
import com.niit.shopping.Model.Product;
 
public class CategoryTest {
	private static AnnotationConfigApplicationContext context;
	private static Category category;
	private static CategoryDAO categoryDAO;
	
	@BeforeClass
	public static  void init()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("com.niit.shopping");
		context.refresh();
		
		category=(Category)context.getBean("category");
		categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
  
	}
	
	@Ignore
	@Test
	public void add_category(){
		
		category.setCatId(104);
		category.setCatName("camera");
		category.setCatDescp("nikkon d5300");
		assertEquals(true,categoryDAO.add_category(category));
	}
	@Ignore
	@Test     
	public void getcategorybyID()
	{
		Category category= categoryDAO.getcatbyId(1);
		assertNotNull(category);
		assertEquals("Laptops", category.getCatName());
	}
	@Ignore
	@Test
	public void update_category(){
		Category category=categoryDAO.getcatbyId(3);
		category.setCatDescp("samsung mobile");
		category.setCatName("samsung j2 ");
		assertEquals(true,categoryDAO.update_category(category));
	}
	@Ignore
	@Test
	public void delete_category(){
		Category category=categoryDAO.getcatbyId(33);
		assertEquals(true,categoryDAO.delete_category(category));
	}
	@Test
	public void getAllcategory(){
		List<Category> list=categoryDAO.getlist_category();
		assertEquals(13,list.size());
		for(Category cat:list){
			System.out.println(cat.getCatId()+""+cat.getCatName());
		}
	}
}