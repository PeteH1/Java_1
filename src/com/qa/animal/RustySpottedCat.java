package com.qa.animal;

public class RustySpottedCat extends Animal implements Mammal {

	private String cuteness;

	public RustySpottedCat(String name, String largeness, String colour, int age, String cuteness) {
		super(name, largeness, colour, age);
		this.cuteness = cuteness;
	}

	public void beACat() {
		System.out.println("I'm doing tiny cat things.");
	}

	@Override
	public void eat() {
		System.out.println(getName() + " is eating teenie tiny things because they are teenie tiny.");
	}

	@Override
	public void greeting() {
		System.out.println("Hi there, I am a tiny wild cat and my name is " + getName());
	}

	public String getCuteness() {
		return cuteness;
	}

	public void setCuteness(String cuteness) {
		this.cuteness = cuteness;
	}

	@Override
	public void beAMammal() {
		System.out.println("I'm a teenie tiny mammal.");
	}

}
