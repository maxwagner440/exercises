package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class SpOrderName {

	private String firstName;
	private String middleName;
	private String lastName;
	private String order;
	private Map<String, String> theFinishedName =  new HashMap<>();
	
	public SpOrderName(String firstName, String middleName, String lastName, String order){
		this.firstName =firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.order = order;
		
		theFinishedName.put("First MI Last", firstName + " " + middleName + " " + lastName);
		theFinishedName.put("First Last", firstName + " " + lastName);
		theFinishedName.put("Last, First MI", lastName + ", " + firstName + " " + middleName);
		theFinishedName.put("Last, First", lastName + ", " + firstName);
	}

	public String getFinishedName(){
		String result = theFinishedName.get(order);
		return result;
	}
	public String getFirstName() {
		return firstName;
	}



	public String getMiddleName() {
		return middleName;
	}


	public String getLastName() {
		return lastName;
	}

	
}
