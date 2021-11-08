package com.qa.operators;

public class Tax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int taxRate(int salary) {
		if (salary < 15000) {
			return 0;
		} else if (salary < 20000) {
			return 10;
		} else if (salary < 30000) {
			return 15;
		} else if (salary < 45000) {
			return 20;
		} else {
			return 25;
		}
	}

}
