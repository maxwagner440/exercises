package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class PostalService implements DeliveryDriver {

	private double weight;
	private double rate = 0;
	private double wVar;
	private String theClass;
	 
	 
	 
	
	
	public PostalService(){
	}
	
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
		Map<Integer, Double> theFirstClass = new HashMap<Integer, Double>();
		theFirstClass.put(1, 0.035);
		theFirstClass.put(2, 0.040);
		theFirstClass.put(3, 0.047);
		theFirstClass.put(4, 0.195);
		theFirstClass.put(5, 0.450);
		theFirstClass.put(6, 0.500);
		
		Map<Integer, Double> theSecondClass = new HashMap<Integer, Double>();
		theSecondClass.put(1, 0.0035);
		theSecondClass.put(2, 0.0040);
		theSecondClass.put(3, 0.0047);
		theSecondClass.put(4, 0.0195);
		theSecondClass.put(5, 0.0450);
		theSecondClass.put(6, 0.0500);
		
		Map<Integer, Double> theThirdClass = new HashMap<Integer, Double>();
		theThirdClass.put(1, 0.0020);
		theThirdClass.put(2, 0.0022);
		theThirdClass.put(3, 0.0024);
		theThirdClass.put(4, 0.0150);
		theThirdClass.put(5, 0.0160);
		theThirdClass.put(6, 0.0170);
		
		Map<Integer, Double> mapVar = new HashMap<Integer, Double>();
		if(poundsOrOunces == "P"){
			weight = weight * 16;
		}
		
		if(theClass.contentEquals("First")){
			mapVar.putAll(theFirstClass);
			this.theClass = "First";
		}
		else if(theClass.contentEquals("Second")){
			mapVar.putAll(theSecondClass);
			this.theClass = "Second";
		}
		else if(theClass.contentEquals("Third")){
			mapVar.putAll(theThirdClass);
			this.theClass = "Third";
		}
		
		if(weight <= 2){
			this.setwVar(1);
		}
		else if(weight <= 8){
			this.setwVar(2);
		}
		else if(weight <= 15){
			this.setwVar(3);
		}
		else if(weight <= 48){
			this.setwVar(4);
		}
		else if(weight <= 128){
			this.setwVar(5);
		}
		else if(weight <= 144){
			this.setwVar(6);
		}
		else{
			
		}
			
		double perMileRate = mapVar.get(this.getwVar());
		double rate = perMileRate * distance;
		return rate;
	}

	public String toString(){
		return "Postal Service" + theClass + " Class";
	}

	public double getwVar() {
		return wVar;
	}

	public void setwVar(double wVar) {
		this.wVar = wVar;
	}
}
