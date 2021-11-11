package com.qa.encapsulation;

public class Encapsulation {

	private String name;
	private int favNumber;
	private double doubleNum;
	private float floatNum;
	private long longNum;

	public Encapsulation(String name, int favNumber, double doubleNum, float floatNum, long longNum) {
		this.name = name;
		this.favNumber = favNumber;
		this.doubleNum = doubleNum;
		this.floatNum = floatNum;
		this.longNum = longNum;
	}

	public Encapsulation() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFavNumber() {
		return favNumber;
	}

	public void setFavNumber(int favNumber) {
		this.favNumber = favNumber;
	}

	public double getDoubleNum() {
		return doubleNum;
	}

	public void setDoubleNum(double doubleNum) {
		this.doubleNum = doubleNum;
	}

	public float getFloatNum() {
		return floatNum;
	}

	public void setFloatNum(float floatNum) {
		this.floatNum = floatNum;
	}

	public long getLongNum() {
		return longNum;
	}

	public void setLongNum(long longNum) {
		this.longNum = longNum;
	}

	@Override
	public String toString() {
		return "This Encapsulation is called " + name + ", its favourite number is " + favNumber + ".\nIts double is "
				+ doubleNum + ", float is " + floatNum + ", and long is " + longNum + ". Goodbye!";
	}

}
