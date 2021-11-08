package com.qa.iteration;

public class Numbers {

	public static void main(String[] args) {
		System.out.println(addDigits(123456789));

	}

	public static int addDigits(int x) {
		int sum = 0;
		while (x > 0) {
			int last_digit = x % 10;
			sum = sum + last_digit;
			x = x / 10;
		}
		return sum;
	}

//	public static String writeNumber(int x) {
//		String digit1 = "";
//		String digit2 = "";
//		String digit3 = "";
//		String digit4 = "";
//		String digit5 = "";
//
//	}

}
