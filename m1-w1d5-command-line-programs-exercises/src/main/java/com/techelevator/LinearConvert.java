package com.techelevator;

import java.util.Scanner;

/*
 The foot to meter conversion formula is:
 	m = f * 0.3048
 	
 The meter to foot conversion formula is:
 	f = m * 3.2808399
 	
 Write a command line program which prompts a user to enter a length, and whether the measurement is in (m)eters or (f)eet.
 Convert the length to the opposite measurement, and display the old and new measurements to the console.
  
 $ java LinearConvert
 Please enter the length: 58
 Is the measurement in (m)eter, or (f)eet? f
 58f is 17m.
 */

public class LinearConvert {
			// the main method is this:
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the length: ");
							/*nextDouble() is going to search for next double until it runs i					nto sometihng the user puts in thats NOT a "Double variable"*/
		double length = input.nextDouble();
				/*this gets rid of the "enter button" the person hits*/
		input.nextLine();
		
		System.out.print("Is the measurement in (m)eter, or (f)eet? ");
			/*this eats the return again*/
		String lengthType = input.nextLine();
		
		System.out.print(length + lengthType + " " + "is" + " " + doConversion(length, lengthType) + (lengthType.toLowerCase().startsWith("m") ? "f" : "m"));
	}//second method:
	public static double doConversion(double length, String lengthType){
		double resultMeters = length * 0.3048;
		double resultFeet = length * 3.2808399;
		
		if(lengthType.equalsIgnoreCase("m")){
			return resultFeet;
		}else{
			return resultMeters;
		}
	}
}
