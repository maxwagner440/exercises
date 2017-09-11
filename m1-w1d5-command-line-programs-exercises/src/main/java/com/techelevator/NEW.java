package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NEW {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("What did we buy today (separate items with spaces)?");
		
		
		Map<String, Double> storeItems = new HashMap<>();
		
		storeItems.put("Apple", 3.00);
		storeItems.put("Banana", 4.00);
		storeItems.put("Orange", 3.50);
		storeItems.put("Beer", 7.79);
		
		
		String itemsActuallyPurchased = input.nextLine();
		
		itemsActuallyPurchased.split(" ");
		
		for()
		if(itemsActuallyPurchased.equals(storeItems)){
			System.out.println(x);
		}
	}

}
