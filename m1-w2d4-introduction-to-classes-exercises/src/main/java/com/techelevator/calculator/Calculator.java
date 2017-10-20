package com.techelevator.calculator;

public class Calculator {

	private int currentValue = 0;

	
	
	
	
	public int add(int addend){
		this.currentValue += addend;
		return currentValue;
	}
	
	
	public int multiply(int multiplier){
		this.currentValue *= multiplier;
		return currentValue;
	}
	
	public int subtract(int subtrahend){
		this.currentValue -= subtrahend;
		return currentValue;
	}
	
	public int power(int exponent) {

		this.currentValue =  (int) Math.pow(currentValue, exponent);
		return currentValue;
		}
	
	
	public void reset(){
		this.currentValue = 0;
	}
	 
	
	
	
	public int getCurrentValue() {
		return currentValue;
	}

	public void setCurrentValue(int currentValue) {
		this.currentValue = currentValue;
	}
	
	
	
	
	
	
	
	
	
	
	
}
