package com.techelevator.validation.model;

import java.time.LocalDate;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class Registration {
	
	@NotBlank(message="First Name is required")
	private String first;
	
	@NotBlank(message="Last Name is required")
	private String last;
	
	@NotBlank(message="Email is required") @Email(message="email is required")
	private String email;
	
	private String confirmE;
	
	@NotBlank(message="Password is required")
	private String password;
	
	private String confirmP;
	
	@Pattern(regexp="^\\d{2}\\-\\d{2}-\\d{4}$", message="Please enter a valid Date")
	private LocalDate birthday;
	
	@NotNull(message="Must Select Ticket Amount") @Min(value=1, message="Select atleast one ticket") @Max(value=10, message="Cannot buy this many tickets")
	private int tickets;
	
	
	
	
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getConfirmE() {
		return confirmE;
	}
	public void setConfirmE(String confirmE) {
		this.confirmE = confirmE;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmP() {
		return confirmP;
	}
	public void setConfirmP(String confirmP) {
		this.confirmP = confirmP;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	public int getTickets() {
		return tickets;
	}
	public void setTickets(int tickets) {
		this.tickets = tickets;
	}

}
