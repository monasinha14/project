package com.niit.shopping.Dao;

import java.util.List;

import com.niit.shopping.Model.Category;



public interface CategoryDAO {
	public boolean add_category(Category category);
	public boolean update_category(Category category);
	public boolean delete_category(Category category);
	public Category getcatbyId(int category);
	public List<Category> getlist_category();

}

 