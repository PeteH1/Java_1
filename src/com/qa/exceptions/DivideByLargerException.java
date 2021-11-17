package com.qa.exceptions;

public class DivideByLargerException extends Exception {

	private static final long serialVersionUID = -1320036057296309310L;

	public void message() {
		System.out.println("Cannot divide if the second number is larger than the first number.");
	}

}
