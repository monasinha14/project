package com.niit.shopping.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.shopping.Model.Supplier;
@Repository(value="Suppiler")
@Transactional
public class SupplierImpl implements SupplierDAO {
	@Autowired
	SessionFactory sessionFactory;
	

	public boolean addsup(Supplier supplier) {
	
		try {
			sessionFactory.getCurrentSession().save(supplier);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	public boolean updatesup(Supplier supplier) {
		try {
			sessionFactory.getCurrentSession().update(supplier);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deletesup(Supplier supplier) {
		try {
			sessionFactory.getCurrentSession().delete(supplier);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return false;
	}

	public Supplier getsupbyId(int supplier) {
	return (Supplier)sessionFactory.getCurrentSession().get(Supplier.class, supplier);
		// TODO Auto-generated method stub
	
	}

	public List<Supplier> getListsup() {
		return sessionFactory.getCurrentSession().createQuery("from Supplier").list();
	
		
	}

}
