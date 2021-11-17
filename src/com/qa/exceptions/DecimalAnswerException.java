package com.qa.exceptions;

public class DecimalAnswerException extends Exception {

	private static final long serialVersionUID = 7529977768233844045L;

	public void message() {
		System.out.println("Those numbers don't give an integer result.");
	}

}
