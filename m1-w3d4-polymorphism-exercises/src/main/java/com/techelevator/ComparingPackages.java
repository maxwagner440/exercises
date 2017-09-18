package com.techelevator;

import java.util.Scanner;

public class ComparingPackages {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the weight of the package?");
		
		double packageWeight = input.nextDouble();
		
		System.out.println("(P)ounds or (O)unces?");
		
		String poundsOrOunces = input.next();
		
		
		System.out.println("What distance will it be traveling to?");
		
		int travelDistance = input.nextInt();
		
		DeliveryDriver postalFirst = new PostalService();
		postalFirst.calculateRate(travelDistance, packageWeight, poundsOrOunces, "First");
		System.out.println(postalFirst.toString());
		
		
	
	}

	
}
