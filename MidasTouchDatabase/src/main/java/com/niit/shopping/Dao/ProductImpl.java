package com.niit.shopping.Dao;


import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.shopping.Model.Product;
@Repository(value="productDAO")
@Transactional

public class ProductImpl implements ProductDAO {
	@Autowired
	SessionFactory sessionFactory;

	public boolean add_product(Product product) {
		try {
			sessionFactory.getCurrentSession().save(product);
			return true;
		} catch (HibernateException e) {
			 
			e.printStackTrace();
		}
		return false;
	}

	public boolean delete_product(Product product) {
		try {
			
			sessionFactory.getCurrentSession().delete(product);
			return true;
		} catch (HibernateException e) {
			 
			e.printStackTrace();
		}
		 
		return false;
	}

	public boolean update_product(Product product) {
		try {
			sessionFactory.getCurrentSession().update(product);
			return true;
		} catch (HibernateException e) {
			 
			e.printStackTrace();
		}
		 
		return false;
	}

	public Product getproductby_Id(int product) {

return (Product)sessionFactory.getCurrentSession().get(Product.class, product);
	}

	public List<Product> getlist_product() {
		return  sessionFactory.getCurrentSession().createQuery("from Product").list();
	}

}
