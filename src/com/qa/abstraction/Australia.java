package com.qa.abstraction;

public class Australia extends Country implements Hot, Developed, Greeting {

	public void animals() {
		System.out.println("All the animals here will kill you.");
	}

	@Override
	public void sayName() {
		System.out.println("I am Australia.");
	}

	@Override
	public void decDeveloped() {
		System.out.println("I'm a developed country.");
	}

	@Override
	public void random() {
		String what = "I'm running out of idea for what to with methods.";
		what.length();
	}

	@Override
	public void random2() {
		String runOut = "I've fully run out of ideas.";
		runOut.length();
	}

	@Override
	public void declareHot() {
		System.out.println("It's hot down under.");
	}

	@Override
	public void takeOffCoat() {
		System.out.println("Taking off coat.");
	}

	@Override
	public void keepCool() {
		System.out.println("Have a drink.");
	}

	@Override
	public void greeting() {
		System.out.println("G'DAY MATE");

	}
}
