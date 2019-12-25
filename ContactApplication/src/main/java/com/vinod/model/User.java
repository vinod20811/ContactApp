package com.vinod.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User 
{
	@Id
	private int uId;
	private String uName;
	private String uMail;	
	private String loginId;
	private String password;
	private long uMobile;
	
	public User() {
		super();
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getuMail() {
		return uMail;
	}

	public void setuMail(String uMail) {
		this.uMail = uMail;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getuMobile() {
		return uMobile;
	}

	public void setuMobile(long uMobile) {
		this.uMobile = uMobile;
	}

	@Override
	public String toString() {
		return "User [uId=" + uId + ", uName=" + uName + ", uMobile=" + uMobile + "]";
	}


	


	
}
