package com.qa.extrapart4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {

	public static void main(String[] args) {

		System.out.println(FactorialMethods.factorial(2));

		System.out.println(FactorialMethods.factorialRecursion(0));

		List<Integer> numbers = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 11, 13, 15, 17));

		System.out.println(NthOdd.findNthOdd(numbers, 6));

	}

}
