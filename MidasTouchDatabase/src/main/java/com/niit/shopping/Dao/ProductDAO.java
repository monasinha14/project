package com.niit.shopping.Dao;

import java.util.List;

import com.niit.shopping.Model.Product;

public interface ProductDAO {
	public boolean add_product(Product product);
	public boolean delete_product(Product product);
	public boolean update_product(Product product);
	public Product getproductby_Id(int product);
	public List<Product> getlist_product();

}
