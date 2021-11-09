package com.qa.extrapart4;

public class FactorialMethods {

	public static int factorial(int input) {
		int x = 1;
		for (int i = 2; i <= input; i++) {
			x = x * i;
		}
		return x;
	}

	public static int factorialRecursion(int input) {
		if (input == 0) {
			return 1;
		} else if (input <= 2) {
			return input;
		} else {
			return (input * factorialRecursion(input - 1));
		}
	}

}
