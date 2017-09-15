package com.techelevator;

public class Car implements Vehicle {
	
	double distance;
	int axles;
	boolean noTrailer = true;
	
	public Car(boolean noTrailer){
		setDistance(0.0);
		this.noTrailer = noTrailer;
		
	}
	
	
	
	
	public double getDistance() {
		return distance;
	}

	@Override
	public double calculateToll(double distance) {
	double toll = distance * (0.020);
		if(this.noTrailer){
			toll += 1.00;
		}
			return toll;
	}





	public boolean isNoTrailer() {
		return noTrailer;
	}



	public void setNoTrailer(boolean noTrailer) {
		this.noTrailer = noTrailer;
	}

	public String toString(){
		return "Car";
	}



	
	public void setDistance(double distance) {
		this.distance = distance;
	}
}
