package com.qa.iteration;

public class Coins {

	public static void main(String[] args) {
		System.out.println(changeCalc(678432.54, 78943256.99));
	}

	public static String changeCalc(double cost, double payment) {
		double change = payment - cost;
		int twenties = 0;
		int tens = 0;
		int fivers = 0;
		int two_pounds = 0;
		int one_pounds = 0;
		int fifty_p = 0;
		int twenty_p = 0;
		int ten_p = 0;
		int five_p = 0;
		int two_p = 0;
		int one_p = 0;

		while (change >= 20.0) {
			twenties += 1;
			change -= 20.0;
		}
		while (change >= 10.0) {
			tens += 1;
			change -= 10.0;
		}
		while (change >= 5.0) {
			fivers += 1;
			change -= 5.0;
		}
		while (change >= 2.0) {
			two_pounds += 1;
			change -= 2.0;
		}
		while (change >= 1.0) {
			one_pounds += 1;
			change -= 1.0;
		}
		while (change >= 0.5) {
			fifty_p += 1;
			change -= 0.5;
		}
		while (change >= 0.2) {
			twenty_p += 1;
			change -= 0.2;
		}
		while (change >= 0.1) {
			ten_p += 1;
			change -= 0.1;
		}
		while (change >= 0.05) {
			five_p += 1;
			change -= 0.05;
		}
		while (change >= 0.02) {
			two_p += 1;
			change -= 0.02;
		}
		while (change > 0.0) {
			one_p += 1;
			change -= 0.01;
		}

		String output = "Your change is: ";

		if (twenties > 0) {
			output += twenties + " £20 note(s), ";
		}
		if (tens > 0) {
			output += tens + " £10 note(s), ";
		}
		if (fivers > 0) {
			output += fivers + " £5 note(s), ";
		}
		if (two_pounds > 0) {
			output += two_pounds + " £2 coin(s), ";
		}
		if (one_pounds > 0) {
			output += one_pounds + " £1 coin(s), ";
		}
		if (fifty_p > 0) {
			output += fifty_p + " 50p coin(s), ";
		}
		if (twenty_p > 0) {
			output += twenty_p + " 20p coin(s), ";
		}
		if (ten_p > 0) {
			output += ten_p + " 10p coin(s), ";
		}
		if (five_p > 0) {
			output += five_p + " 5p coin(s), ";
		}
		if (two_p > 0) {
			output += two_p + " 2p coin(s), ";
		}
		if (one_p > 0) {
			output += one_p + " 1p coin(s), ";
		}
		output = output + "Hooray!";
		return output;
	}
}
