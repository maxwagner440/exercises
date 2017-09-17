package com.techelevator;

public class ComparingPackages {

	public static void main(String[] args) {
		
		DeliveryDriver postalService = new PostalService();
		postalService.calculateRate(50, 16, true, "First");
		
		System.out.println(postalService.calculateRate(100, 16, true, "Third"));
	
	}

	
}
