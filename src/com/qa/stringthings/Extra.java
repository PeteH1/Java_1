package com.qa.stringthings;

import java.util.Arrays;

public class Extra {

	public static void main(String[] args) {

		isPalindrome("Hannah");

		isCaseSensitivePalindrome("Hannah");

		int[] numbers = { 900, 24, 3, 423, 5000, 6, 71 };

		System.out.println(secondLargestNum(numbers));

	}

	public static boolean isCaseSensitivePalindrome(String input) {
		String reverse = new StringBuilder(input).reverse().toString();
		System.out.println(reverse.equals(input));
		return reverse.equals(input);
	}

	public static boolean isPalindrome(String input) {
		String reverse = new StringBuilder(input).reverse().toString().toLowerCase();
		System.out.println(reverse.equals(input.toLowerCase()));
		return reverse.equals(input);
	}

//	public static String longestCommonSequence(String input1, String input2) {
//		
//	}

	public static int secondLargestNum(int[] input) {
		Arrays.sort(input);
		return input[input.length - 2];
	}

}
