package com.ck.interview.questions;

//custom marker interface  
interface Car {

}

class Vehicle implements Car {
	static void isVehicle() {
		System.out.println("Car is a vehicle.");
	}
}

public class CustomMarkerInterfaceExample {
	public static void main(String args[]) {
		Vehicle.isVehicle();
	}
}