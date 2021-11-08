package com.qa.iteration;

public class BottlesOfBeer {

	public static void main(String[] args) {
		song();
	}

	public static void song() {
		for (int bottles = 99; bottles > 0;) {
			System.out.println(bottles + " bottles of beer on the wall, " + bottles + " bottles of beer.");
			bottles--;
			System.out.println("Take one down and pass it around, " + bottles + " bottles of beer on the wall.");
		}
		System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
		System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
	}

}
