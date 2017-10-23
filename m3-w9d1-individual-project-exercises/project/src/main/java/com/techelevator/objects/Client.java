package com.techelevator.objects;
import java.math.BigDecimal;

public class Client {

	private BigDecimal weightInLbs;
	private BigDecimal goalWeightInLbs;
	private BigDecimal height;
	private BigDecimal age;
	private boolean isFemale = true;
	private String username;
	private BigDecimal BMR;
	
	
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
	
	public boolean isFemale() {
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







	public void setBMR(BigDecimal BMR) {
		this.BMR = BMR;
		
	}



}
