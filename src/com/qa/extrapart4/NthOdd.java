package com.qa.extrapart4;

import java.util.List;

public class NthOdd {

	public static int findNthOdd(List<Integer> input, int n) {
		int count = 0;
		for (int i : input) {
			if (i % 2 != 0) {
				count++;
			}
			if (count == n) {
				return i;
			}
		}
		return -1;
	}

}
