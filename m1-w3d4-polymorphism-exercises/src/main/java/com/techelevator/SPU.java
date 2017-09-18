package com.techelevator;

public class SPU implements DeliveryDriver {

	double rate = 0.00;
	
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

	@Override
	public double calculateRate(int distance, double weight, String poundsOrOunces, String theClass) {
		if(poundsOrOunces == "P"){
			weight = weight * 16;
		}
		if(theClass == "Four-Day"){
			rate = (weight * 0.0050) * distance;
		}
		else if(theClass == "Two-Day"){
			rate = (weight * 0.0050) * distance;
		}
		else if(theClass == "Next-Day"){
			rate = (weight * 0.075) * distance;
		}
		else{
			rate = 0.00;
		}
		return rate;
	}

}
