package com.qa.animal;

public class Elephant extends Animal implements Mammal {

	private boolean hasBigTrunk = true;
	private boolean sometimesforgets = false;
	private boolean isInRoom;

	public Elephant(String name, String largeness, String colour, int age, boolean hasBigTrunk,
			boolean sometimesforgets, boolean isInRoom) {
		super(name, largeness, colour, age);
		this.hasBigTrunk = hasBigTrunk;
		this.sometimesforgets = sometimesforgets;
		this.isInRoom = isInRoom;
	}

	public void beAnElephant() {
		System.out.println("Doing elephant things.");
	}

	@Override
	public void eat() {
		System.out.println(getName() + " is eating roots, grasses, fruit, bark and whatever else elephants eat.");
	}

	@Override
	public void greeting() {
		System.out.println("HELLO MY NAME IS " + getName() + "AND I AM A BIG OL' ELEPHANT!!");
	}

	public boolean isHasBigTrunk() {
		return hasBigTrunk;
	}

	public void setHasBigTrunk(boolean hasBigTrunk) {
		this.hasBigTrunk = hasBigTrunk;
	}

	public boolean isSometimesforgets() {
		return sometimesforgets;
	}

	public void setSometimesforgets(boolean sometimesforgets) {
		this.sometimesforgets = sometimesforgets;
	}

	public boolean isInRoom() {
		return isInRoom;
	}

	public void setInRoom(boolean isInRoom) {
		this.isInRoom = isInRoom;
	}

	@Override
	public void beAMammal() {
		System.out.println("I am a big mammal.");
	}

}
