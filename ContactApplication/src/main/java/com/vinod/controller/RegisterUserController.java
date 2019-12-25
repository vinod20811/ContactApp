package com.vinod.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vinod.model.User;
import com.vinod.service.UserServiceImpl;

@Controller
public class RegisterUserController {
	@RequestMapping("/register_user")
	public String registerUser(HttpServletRequest req)
	{
		System.out.println("Vinod Register apge");
		UserServiceImpl userServiceImpl=new UserServiceImpl();
		User user=new User();
		user.setuId(Integer.parseInt(req.getParameter("userId")));
		user.setuName((req.getParameter("mail")));
		user.setLoginId(req.getParameter("loginId"));
		user.setuMail(req.getParameter("mail"));
		user.setuMobile(Long.parseLong(req.getParameter("mobile")));
		user.setPassword(req.getParameter("password"));
		
		userServiceImpl.save(user);
		return "login?col=reg";
	}

}
