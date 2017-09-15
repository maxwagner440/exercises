package com.techelevator;

public interface DeliveryDriver {
	
	public double getWeight();
	public int getDistance();
	public double calculateRate(int distance, double weight);
		
	}

