package com.qa.banking;

public class Runner {

	public static void main(String[] args) {

		BankAccount account = new BankAccount("Best Bank Account", 10.0, 1000000);
		Banker nigel = new Banker("Nigel");

		Banker.introStatic();
		nigel.changeInterestRate(account, 15.0);
		nigel.intro();

	}

}
