package com.niit.shopping.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.shopping.Model.Product;
import com.niit.shopping.Model.User;

@Repository(value="userDAO")
@Transactional
public class UserImpl implements UserDAO {
	@Autowired
	SessionFactory sessionFactory;

	public boolean add_user(User user) {
		try {
			sessionFactory.getCurrentSession().save(user);
			return true;
		} catch (HibernateException e) {
			 
			e.printStackTrace();
		}
		 
		return false;
	}

	public boolean delete_user(User user) {
		try {
			sessionFactory.getCurrentSession().delete(user);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		return false;
	}

	public boolean update_user(User user) {
		try {
			sessionFactory.getCurrentSession().update(user);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		return false;
	}

	public User getuserby_Id(int user) {
		
	return (User)sessionFactory.getCurrentSession().get(User.class, user);
	}

	public List<User> getuserList() {
		 
		return  sessionFactory.getCurrentSession().createQuery("from User").list();
	}

}
