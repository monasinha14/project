package com.niit.shopping.Dao;

import java.util.List;

import com.niit.shopping.Model.User;

public interface UserDAO {
    public boolean add_user(User user);
    public boolean delete_user(User user);
    public boolean update_user(User user);
    public User getuserby_Id(int user);
    public List<User> getuserList();
}
