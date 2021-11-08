package com.qa.arraypractice;

import java.util.ArrayList;
import java.util.List;

public class EFLExercise {

	public static boolean isEven(int num) {
		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		List<String> people = new ArrayList<>(List.of("Simon", "Felicity", "Marcus", "Wendy"));

		for (String i : people) {
			System.out.println(i);
		}

		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		for (int i : numbers) {
			int a = i * i;
			System.out.println(a);
		}

		for (int i : numbers) {
			if (isEven(i)) {
				int a = i * i * i;
				System.out.println(a);
			} else {
				int b = i * i;
				System.out.println(b);
			}
		}

	}

}
