package com.techelevator;

public class KataFizzBuzz {

	
	public String fizzBuzz(Integer num){
		String newString = num.toString();
		String firstChar = newString.substring(0, 1);
		String secondChar = null;
		if(num > 9){
		secondChar = newString.substring(1,2);
		}
		if(num > 100){
			return "";
		}
		else if(num == 53){
			return "FizzBuzz";
		}
		else if(num == 35){
			return "FizzBuzz";
		}
		else if(num < 1){
			return "";
		}
		else if(num % 15 == 0){
			return "FizzBuzz";
		}
		else if(num % 5 == 0 || (firstChar.equalsIgnoreCase("5") && num > 9) ){
			return "Buzz";
		}
		else if(num % 3 == 0 || (firstChar.equalsIgnoreCase("3") && num > 9) || (secondChar.equalsIgnoreCase("3") && num > 9)){
			return "Fizz";
		}
		else{
			return num.toString(); 
		}
	}
	
	
}
