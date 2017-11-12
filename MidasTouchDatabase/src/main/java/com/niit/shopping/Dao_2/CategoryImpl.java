package com.niit.shopping.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.shopping.Model.Category;


@Repository(value="categoryDAO")
@Transactional
 
public class CategoryImpl implements CategoryDAO {
	@Autowired
	SessionFactory sessionFactory;

	public boolean add_category(Category category) {
		try {
			sessionFactory.getCurrentSession().save(category);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	public boolean update_category(Category category) {
		try {
			sessionFactory.getCurrentSession().update(category);
		} catch (HibernateException e) {
			 
			e.printStackTrace();
		}
		 
		return false;
	}

	public boolean delete_category(Category category) {
		try {
			sessionFactory.getCurrentSession().delete(category);
		} catch (HibernateException e) {
		 
			e.printStackTrace();
		}
		 
		return false;
	}

	public Category getcatbyId(int catId) {

		return (Category)sessionFactory.getCurrentSession().get(Category.class, catId);
	 
	}

	public List<Category> getlist_category() {
 
		return  sessionFactory.getCurrentSession().createQuery("from Category").list();
	}
 
}
