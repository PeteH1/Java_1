package com.qa.operators;

import java.util.Scanner;

public class Results {

	public static int physics = 0;
	public static int chemistry = 0;
	public static int biology = 0;
	public static int total = 0;
	public static double percentage = 0.0;

	public static int total_mark(int p, int c, int b) {
		int overall = p + b + c;
		return overall;
	}

	public static double total_percentage(int mark) {
		double percentage = (Math.round(mark / 0.045)) / 100.0d;
		return percentage;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("HELLO AND WELCOME!!! \nWhat mark did you get in your Physics exam?");
		physics = scan.nextInt();

		System.out.println("What mark did you get in your Chemistry exam?");
		chemistry = scan.nextInt();

		System.out.println("What mark did you get in your Biology exam?");
		biology = scan.nextInt();

		scan.close();

		total = total_mark(physics, chemistry, biology);
		percentage = total_percentage(total);

		System.out.println("Your total mark was " + total + " out of 450!!!");

		System.out.println("Your total percentage was " + percentage + "%");

	}

}
