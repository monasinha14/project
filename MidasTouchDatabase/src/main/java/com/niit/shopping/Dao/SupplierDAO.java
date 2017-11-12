package com.niit.shopping.Dao;

import java.util.List;

import com.niit.shopping.Model.Supplier;

public interface SupplierDAO {
	public boolean addsup(Supplier supplier);
	public boolean updatesup(Supplier supplier);
	public boolean deletesup(Supplier supplier);
	public Supplier getsupbyId(int supplier);
	public List<Supplier> getListsup();

}
