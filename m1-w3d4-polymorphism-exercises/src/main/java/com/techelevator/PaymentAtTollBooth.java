package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class  PaymentAtTollBooth {

	public static void main(String[] args) {
	
		String s = String.format("%s %25s %15s", "Vehicle", "Distance Traveled", "Toll $");
	System.out.println(s);
	
	List<Vehicle> theVehicles = new ArrayList<>();
	
	Car myCar1 = new Car(false);
	Truck myTruck1 = new Truck(6);
	Tank myTank1 = new Tank();
	Truck myTruck2 = new Truck(8);
	
	
	theVehicles.add(myCar1);
	theVehicles.add(myTruck1);
	theVehicles.add(myTank1);
	theVehicles.add(myTruck2);
	
	
	
	for(Vehicle x : theVehicles){
		//x.setDistance(98.0);
		double distance = 98;
		String thisString = String.format("%s %25s %15s", x.toString(),  distance, x.calculateToll(distance));
		System.out.println(String.format(thisString));
	}
	
	}

}
