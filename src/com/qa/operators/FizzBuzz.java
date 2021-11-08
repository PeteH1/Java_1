package com.qa.operators;

public class FizzBuzz {

	public static void main(String[] args) {
		for (int i = 1; i < 101; i++) {
			System.out.println(fizzbuzz(i));
		}
	}

	public static String fizzbuzz(int i) {
		if (i % 3 == 0 && i % 5 == 0) {
			return "FizzBuzz";
		} else if (i % 5 == 0) {
			return "Buzz";
		} else if (i % 3 == 0) {
			return "Fizz";
		} else {
			return String.format("%d", i);
		}
	}

}
