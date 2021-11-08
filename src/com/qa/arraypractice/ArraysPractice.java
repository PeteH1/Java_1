package com.qa.arraypractice;

import java.util.Arrays;

public class ArraysPractice {

	public static void main(String[] args) {

		int[] array1 = new int[10];

		for (int i = 0; i < array1.length; i++) {
			array1[i] = i + 1;
			System.out.println(array1[i]);
		}
		System.out.println(Arrays.toString(array1));

		for (int i = 0; i < array1.length; i++) {
			array1[i] = (i + 1) * 10;
			System.out.println(array1[i]);
		}

	}

}
