package com.qa.polymorphism;

public class Runner {

	public static void main(String[] args) {
		ScaryCountry australia = new ScaryCountry();
		SafeCountry uk = new SafeCountry();

		/*
		 * indonesia and sweden can't use the methods in SafeCountry & ScaryCountry
		 * without casting them as SafeCountry or ScaryCountry
		 */
		Country indonesia = new ScaryCountry();
		Country sweden = new SafeCountry();

		australia.declare();
		australia.spiders();

		uk.declare();
		uk.allGood();

		indonesia.declare();
		((ScaryCountry) indonesia).spiders();

		sweden.declare();
		((SafeCountry) sweden).allGood();

	}

}
