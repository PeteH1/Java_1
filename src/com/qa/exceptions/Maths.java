package com.qa.exceptions;

public class Maths {

	public double doubleDiv(double x, double y) throws DivideByLargerException {
		if (x < y) {
			throw new DivideByLargerException();
		}
		return x / y;
	}

//	I've thrown the exceptions in slightly different ways here just as an example
	public int intDiv(int x, int y) throws DecimalAnswerException, DivideByLargerException {
		if (x < y) {
			DivideByLargerException d = new DivideByLargerException();
			throw d;
		}
		if (x % y != 0) {
			throw new DecimalAnswerException();
		}
		return x / y;
	}

}
