package com.qa.animal;

public class SlowLoris extends Animal {

	private boolean isCute = true;
	private String eyeSize = "big";

	public SlowLoris(String name, String largeness, String colour, int age, boolean isCute, String eyeSize) {
		super(name, largeness, colour, age);
		this.isCute = isCute;
		this.eyeSize = eyeSize;
	}

	public void beASlowLoris() {
		System.out.println("I'm climbing on the trees and branches n that.");
	}

	@Override
	public void eat() {
		System.out.println(getName() + " is eating whatever a Slow Loris eats.");
	}

	@Override
	public void greeting() {
		System.out.println("Hello my name is " + getName() + " and I am a Slow Loris!!");
	}

	public boolean isCute() {
		return isCute;
	}

	public void setCute(boolean isCute) {
		this.isCute = isCute;
	}

	public String getEyeSize() {
		return eyeSize;
	}

	public void setEyeSize(String eyeSize) {
		this.eyeSize = eyeSize;
	}

}
