package com.techelevator;

public class FedEx implements DeliveryDriver {

	private double rate = 20.00;
	
	@Override
	public double getWeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getDistance() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public double calculateRate(int distance, double weight, String poundsOrOunces, String theClass) {
		if(poundsOrOunces == "P"){
			weight = weight * 16;
		}
		
		if(distance > 500 && weight > 48 ){
			rate = 28.00;
		}
		else if(distance > 500 && weight <= 48){
			rate = 25.00;
		}
		else if(distance <= 500 && weight > 48){
			rate = 23.00;
		}
		else{
			rate = 20.00;
		}
		
		return rate;
	}

	
	public double getRate() {
		return rate;
	}
	
	public String toString(){
		return "With this distance and weight, your rate will be: $" + rate;
	}



}
