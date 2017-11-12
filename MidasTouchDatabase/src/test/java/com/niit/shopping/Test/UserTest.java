/*package com.niit.shopping.Test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shopping.Dao.UserDAO;
import com.niit.shopping.Model.Category;
import com.niit.shopping.Model.User;

public class UserTest {
	private static AnnotationConfigApplicationContext context;
	private static UserDAO userDAO;
	private static User user;
	
	@BeforeClass
	public static void init(){
		context=new AnnotationConfigApplicationContext();
		context.scan("com.niit.shopping");
		context.refresh();
		userDAO=(UserDAO)context.getBean("userDAO");
		user=(User)context.getBean("user");
	}
	@Ignore
	@Test
	public void add_user(){
		 user.setuId(121);
		 user.setuName("MONA");
		 user.setuContact(82710230);
		 user.setuAddress("Begusarai");
		 user.setuEmail("mona@gmail.com");
		 user.setActive(true);
		 assertEquals(true,userDAO.add_user(user));
	}
	@Ignore
	@Test     
	public void getuserId()
	{
		User user= userDAO.getuserby_Id(1);
		assertNotNull(user);
		assertEquals("MONA", user.getuName());
	}
	@Ignore
	@Test
	public void update_User(){
		User user= userDAO.getuserby_Id(1);
		user.setuAddress("DELHI");;
		user.setuName("KULSOOm");
		assertEquals(true,userDAO.update_user(user));
	}
	@Ignore
	@Test
	public void delete_user(){
		User user= userDAO.getuserby_Id(1);
		assertEquals(true,userDAO.delete_user(user));
	}
	@Test
	public void getAllcategory(){
		List<User> list=userDAO.getuserList();
		assertEquals(2,list.size());
		for(User user:list){
			System.out.println(user.getuName()+" "+user.getuEmail());
		}
		
	}
}
 

*/