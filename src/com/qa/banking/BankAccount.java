package com.qa.banking;

public class BankAccount {

	private String name;
	private double interestRate;
	private int penniesWithin;

	public BankAccount(String name, double interestRate, int penniesWithin) {
		this.name = name;
		this.interestRate = interestRate;
		this.penniesWithin = penniesWithin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public int getPenniesWithin() {
		return penniesWithin;
	}

	public void setPenniesWithin(int penniesWithin) {
		this.penniesWithin = penniesWithin;
	}

}
