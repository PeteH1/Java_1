package com.qa.banking;

public class Banker {

	private String name;

	public Banker(String name) {
		this.name = name;
	}

	public static void introStatic() {
		System.out.println("HELLO THERE I AM A BANKER");
	}

	public void intro() {
		System.out.println("HELLO THERE MY NAME IS " + getName() + " AND I AM A BANKER!!!1!");
	}

	public void changeInterestRate(BankAccount account, double newRate) {
		account.setInterestRate(newRate);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
