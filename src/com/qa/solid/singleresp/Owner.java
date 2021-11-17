package com.qa.solid.singleresp;

public class Owner {

	/*
	 * These methods used to be in Dog but makes more sense for them to be separate
	 * >>>> single responsibility
	 */

	public void walk() {
		System.out.println("Lets go for a walk");
	}

	public void playCatch() {
		System.out.println("I got the ball!");
	}

}
