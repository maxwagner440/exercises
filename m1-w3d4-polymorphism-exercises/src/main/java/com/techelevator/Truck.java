package com.techelevator;

public class Truck implements Vehicle {

	int axles;
	
	public Truck(int numberOfAxles){
		this.axles = numberOfAxles;
	};


	@Override
	public double calculateToll(double distance) {
		double toll = 0;
		if(axles == 4){
			toll = distance * (0.040);
			return toll;
		}
		else if(axles == 6){
			toll = distance * (0.045);
			return toll;
		}
		else if(axles >= 8){
			toll = distance * (0.048);
			return toll;
		}
		return 0.0;
	}
	public int getAxles() {
		return axles;
	}
	public void setAxles(int axles) {
		this.axles = axles;
	}
	


	public String toString(){
		return "Truck";
	}



	}


