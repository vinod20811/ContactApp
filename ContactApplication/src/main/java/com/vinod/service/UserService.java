package com.vinod.service;

import java.util.List;

import com.vinod.model.User;

public interface UserService
{
	public void save(User user);
	public void delete(User user);
	public void edit(User user);
	public List<User> userList();
	public User getUser(String userId);
}
