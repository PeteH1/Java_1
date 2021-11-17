package com.qa.exceptions;

public class Runner {

	public static void main(String[] args) {

		Maths maths = new Maths();

		try {
			System.out.println(maths.doubleDiv(470, 1.2));
		} catch (DivideByLargerException e) {
			e.message();
			e.printStackTrace();
		}

		try {
			System.out.println(maths.intDiv(80, 40));
		} catch (DivideByLargerException d) {
			d.message();
			d.printStackTrace();
		} catch (DecimalAnswerException e) {
			e.message();
			e.printStackTrace();
		}
	}

}
