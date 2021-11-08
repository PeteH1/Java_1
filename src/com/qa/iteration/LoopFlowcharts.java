package com.qa.iteration;

public class LoopFlowcharts {

	public static void main(String[] args) {

//		flowchart1();

//		flowchart2();

//		flowchart3();

//		flowchart5();

	}

	public static void flowchart1() {
		for (int a = 100; a <= 200; a++) {
			System.out.println(a);
		}
	}

	public static void flowchart2() {
		for (int a = 100; a <= 200; a++) {
			if (a % 2 == 0) {
				System.out.println(" - ");
			} else {
				System.out.println(" * ");
			}
		}
	}

	public static void flowchart3() {
		for (int x = 0; x < 10; x++) {
			for (int y = 1; y <= 10; y++) {
				System.out.println(y);
			}
		}
	}

	public static void flowchart5() {
		for (int number = 1; number <= 10; number++) {
			for (int count = 1; count <= number; count++) {
				System.out.println(number);
			}
		}
	}

}
