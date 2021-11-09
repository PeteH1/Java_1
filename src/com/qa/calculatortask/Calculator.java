package com.qa.calculatortask;

public class Calculator {

	public static int addition(int x, int y) {
		int z = x + y;
		return z;
	}

	public static int product(int x, int y) {
		int z = x * y;
		return z;
	}

	public static int subtraction(int x, int y) {
		int z = x - y;
		return z;
	}

	public static double division(double x, double y) {
		if (x > y) {
			double z = x / y;
			return z;
		} else {
			System.out.println("First number needs to be larger otherwise I cannae do it :'(");
			return 0.0;
		}

	}

}
