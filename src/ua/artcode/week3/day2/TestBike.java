package ua.artcode.week3.day2;

public class TestBike {
	public static void main(String[] args) {
		Bike bike1 = new Bike();
		String model = "Honda CB 400";
		bike1.model = model;
		bike1.speed = 240;
		bike1.price = 7000;
		bike1.color = "black";
		bike1.go();
		
		Bike bike2 = new Bike();
		bike2.model = "Suzuki K700";
		bike2.speed = 180;
		bike2.price = 10000;
		bike2.color = "red";
		bike2.go();
	}
}
