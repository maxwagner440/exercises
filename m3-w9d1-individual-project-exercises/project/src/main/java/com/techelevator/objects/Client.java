package com.techelevator.objects;
import java.math.BigDecimal;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class Client {

	private Long clientId;
	
	@NotNull(message="must input a weight in lbs")
	private BigDecimal weightInLbs;
	
	@NotNull(message="must input a weight in lbs")
	private BigDecimal goalWeightInLbs;
	
	@NotNull(message="must input a height in inches")
	private BigDecimal height;
	
	@NotNull(message="must input an age")
	private BigDecimal age;
	
	@AssertFalse(message="must input a gender")
	private boolean isFemale = true;
	
	@NotBlank(message="must fill out first name")
	private String firstName;
	
	@NotBlank(message="must fill out last name")
	private String lastName;
	
	@NotBlank(message="must fill out email") @Email(message="email is required")
	private String username;
	
	@NotBlank(message="wrong password, please try again")
	private String password;
	
//	private BigDecimal BMR;
	
	
	public Client(){
	}
	
	
//	public void doCardio(BigDecimal calsBurnt, String modality){
//		Cardio anotherBout = new Cardio(calsBurnt, modality);
//		dailyCals.subtract(anotherBout.getCaloriesBurnt());
//	}
//	
//	public String finishDay(){
//		if((dailyCals.compareTo(BMR)) > 0){
//			return "You were over your daily caloric needs";
//		}
//		else if((dailyCals.compareTo(BMR)) == 0){
//			return "You maintained current weight";
//		}
//		else{
//			return "You were under your daily caloric needs";
//		}
//	};
	
	
	
	public void isMale(){
		isFemale = false;
	}
	
	public boolean getIsFemale() {
		return isFemale;
	}

	public void setFemale(boolean isFemale) {
		this.isFemale = isFemale;
	}

	public BigDecimal getWeightInLbs() {
		return weightInLbs;
	}

	public void setWeightInLbs(BigDecimal weightInLbs) {
		this.weightInLbs = weightInLbs;
	}

	public BigDecimal getHeight() {
		return height;
	}

	public void setHeight(BigDecimal height) {
		this.height = height;
	}

	public BigDecimal getAge() {
		return age;
	}

	public void setAge(BigDecimal age) {
		this.age = age;
	}



	public BigDecimal getGoalWeightInLbs() {
		return goalWeightInLbs;
	}



	public void setGoalWeightInLbs(BigDecimal goalWeightInLbs) {
		this.goalWeightInLbs = goalWeightInLbs;
	}
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}













	public String getPassword() {
		return password;
	}







	public void setPassword(String password) {
		this.password = password;
	}







	public String getFirstName() {
		return firstName;
	}







	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}







	public String getLastName() {
		return lastName;
	}







	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Long getClientId() {
		return clientId;
	}


	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}



}
