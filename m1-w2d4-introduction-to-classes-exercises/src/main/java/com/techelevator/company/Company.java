package com.techelevator.company;

public class Company {

	private String name;
	private int numberOfEmployees;
	private double revenue;
	private double expenses;

	//method: get company size:
	public String getCompanySize(){
		if(numberOfEmployees <= 50){
			return "small";
		}else if(numberOfEmployees >= 51 && numberOfEmployees <= 250){
			return "medium";
		}else{
			return "large";
			
		}
		
	}
	
	//method: profit calc:
	
	public double getProfit(){
		double newprofit = revenue - expenses;
		return newprofit;
	}
	
	
	public String getName(){
		return name;
	}
	
	public void setName(String theName){
			if(theName.length() > 0){
			this.name = theName;
			}
	}
	
	public int getNumberOfEmployees(){
		return numberOfEmployees;
	}
	
	public void setNumberOfEmployees(int nums){
		if(numberOfEmployees >= 0){
			this.numberOfEmployees = nums;
		}else{
			
		}
	}

	public double getRevenue() {
		return revenue;
	}

	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}

	public double getExpenses() {
		return expenses;
	}

	public void setExpenses(double expenses) {
		this.expenses = expenses;
	}
	
	






}
