package com.techelevator;

import java.util.Scanner;

/*
 The Fahrenheit to Celsius conversion formula is:
 	Tc = (Tf - 32) / 1.8
 	where 'Tc' is the temperature in Celsius, and 'Tf' is the temperature in Fahrenheit
 	
 The Celsius to Fahrenheit conversion formula is:
 	Tf = Tc * 1.8 + 32
 	
 Write a command line program which prompts a user to enter a temperature, and whether its in degrees (C)elsius or (F)arenheit.
 Convert the temperature to the opposite degrees, and display the old and new temperatures to the console.
  
 $ java TempConvert
 Please enter the temperature: 58
 Is the temperature in (C)elcius, or (F)arenheit? F
 58F is 14C.
 
 Note why Tf - 32 above is enclosed in parentheses with a comment inside your code. You'll feel better for it, 
 and will start building some good programming habits while you're at it.
 */
public class TempConvert {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Please enter the temperature: ");
		
		int inputTemp = userInput.nextInt();
		
		userInput.nextLine();
		
		System.out.print("Is the temperature in (C)elcius, or (F)arenheit? ");
		
		String farOrCel = userInput.nextLine();
		
		System.out.println(inputTemp + farOrCel + " is " + theConversion(inputTemp, farOrCel));
		
	}
	public static String theConversion(int inputTemp, String farOrCel){
		if(farOrCel.equalsIgnoreCase("F")){
			double inCelcius = (inputTemp - 32) / 1.8;
			String stringInCelcius = inCelcius + "C";
			return stringInCelcius;	
		}else if(farOrCel.equalsIgnoreCase("C")){
			double inFarenheit = (inputTemp * 1.8) + 32;
			String stringInFar = inFarenheit + "F";
			return stringInFar;
		}else{
			return null;
		}
	}
}
