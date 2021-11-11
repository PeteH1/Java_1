package com.qa.abstraction;

public class Runner {

	public static void main(String[] args) {

		/*
		 * This is a rubbish example but I couldn't think of a good one to do that used
		 * lots of interfaces and abstract methods etc
		 */
		Australia australia = new Australia();
		Country mexico = new Mexico();

		australia.greeting();

		mexico.sayName();

		australia.animals();

		/*
		 * I've created Mexico as a Country object, so need to cast it as a Mexico
		 * object before I can use the tequila method, that's contained in the Mexico
		 * class
		 */
		((Mexico) mexico).tequila();

	}

}
