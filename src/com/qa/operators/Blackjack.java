package com.qa.operators;

public class Blackjack {

	public static void main(String[] args) {
		System.out.println(play(-5, -2));
	}

	public static int play(int x, int y) {
		if (x > 0 && y > 0) {
			if (x >= y && x <= 21 || x < y && y > 21) {
				return x;
			} else if (y <= 21) {
				return y;
			} else {
				return 0;
			}
		} else {
			System.out.println("Nah mate it's got to be bigger than 0");
			return 0;
		}
	}

}
