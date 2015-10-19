package com.example.thread;

public class Car {

	static int noOfWheels;
	String color;
	long price;
	String brand;
	
	
	
	
	
	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.brand = "Audi";
		car1.color = "Balck";
		car1.price = 500;
		
		Car car2 = new Car();
		car2.brand = "Mercedes";
		car2.color = "Red";
		car2.price = 5000;
		
		Car.noOfWheels = 4;
		
		System.out.println(car1.noOfWheels);
		System.out.println(Car.noOfWheels);
		
		
		
		
		
		
	}
	
}



