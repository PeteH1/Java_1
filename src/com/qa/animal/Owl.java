package com.qa.animal;

public class Owl extends Animal implements Nocturnal {

	private boolean canTwistHead = true;

	public Owl(String name, String largeness, String colour, int age, boolean canTwistHead, boolean nocturnal) {
		super(name, largeness, colour, age);
		this.canTwistHead = canTwistHead;
	}

	public void beAnOwl() {
		System.out.println("twit twoo I'm doing owl things.");
	}

	@Override
	public void eat() {
		System.out.println("I'm eating mice and things like that.");
	}

	@Override
	public void greeting() {
		System.out.println("Good day. I am an owl and my name is " + getName() + ".");
	}

	public boolean isCanTwistHead() {
		return canTwistHead;
	}

	public void setCanTwistHead(boolean canTwistHead) {
		this.canTwistHead = canTwistHead;
	}

	@Override
	public String toString() {
		return "Owl [canTwistHead=" + canTwistHead + ", getName()=" + getName() + ", getLargeness()=" + getLargeness()
				+ ", getColour()=" + getColour() + ", getAge()=" + getAge() + "]";
	}

	@Override
	public void beNocturnal() {
		System.out.println("It's night time, I'm heading out to catch mice.");
	}

}
