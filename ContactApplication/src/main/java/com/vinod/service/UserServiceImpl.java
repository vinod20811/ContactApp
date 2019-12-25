package com.vinod.service;

import java.util.List;

import com.vinod.dao.UserDAO;
import com.vinod.dao.UserDAOImpl;
import com.vinod.model.User;

public class UserServiceImpl implements UserService{
	UserDAO userDAO=new UserDAOImpl();
	public void save(User user) {
		
		userDAO.save(user);
	}

	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	public void edit(User user) {
		// TODO Auto-generated method stub
		
	}

	public List<User> userList() {
		// TODO Auto-generated method stub
		return null;
	}

	public User getUser(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

}
