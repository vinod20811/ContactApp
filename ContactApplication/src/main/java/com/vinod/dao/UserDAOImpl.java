package com.vinod.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vinod.model.User;

public class UserDAOImpl implements  UserDAO{
	
	public static Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(User.class);
	public static SessionFactory sf=con.buildSessionFactory();
	

	public void save(User user) {
		Session session=sf.openSession();
		session.save(user);		
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
