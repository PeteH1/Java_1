package com.qa.animal;

public abstract class Animal {

	private String name;
	private String largeness;
	private String colour;
	private int age;

	public Animal(String name, String largeness, String colour, int age) {
		super();
		this.name = name;
		this.largeness = largeness;
		this.colour = colour;
		this.age = age;
	}

	public abstract void eat();

	public abstract void greeting();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLargeness() {
		return largeness;
	}

	public void setLargeness(String largeness) {
		this.largeness = largeness;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", largeness=" + largeness + ", colour=" + colour + ", age=" + age + "]";
	}

}
