package com.qa.inheritance.pets;

public class Runner {

	public static void main(String[] args) {

		Cat wallace = new Cat();
		Dog grommit = new Dog();

		wallace.doThing();
		grommit.doThing();

		wallace.makeNoise();
		grommit.makeNoise();

	}

}
