package com.techelevator.critter.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

public class User {

	private String userName;
	
	@Min(value=15, message="Password too short, must be at least 15 characters")
	@Pattern(regexp="[A-Z]", message="Must have a capital letter")
	private String password;
	
	private String confirmPassword;
	
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
	
	
}
