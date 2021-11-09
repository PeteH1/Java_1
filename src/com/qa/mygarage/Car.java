package com.qa.mygarage;

public class Car extends Vehicle {

	private int numOfDoors;
	private int mileage;

	public Car(int numOfWheels, String size, String speed, String colour, boolean isExcellent, int numOfDoors,
			int mileage) {
		super(numOfWheels, size, speed, colour, isExcellent);
		this.numOfDoors = numOfDoors;
		this.mileage = mileage;
	}

	public int getNumOfDoors() {
		return numOfDoors;
	}

	public void setNumOfDoors(int numOfDoors) {
		this.numOfDoors = numOfDoors;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "Car [numOfDoors=" + numOfDoors + ", mileage=" + mileage + "][super: " + super.toString() + "]";
	}

}
