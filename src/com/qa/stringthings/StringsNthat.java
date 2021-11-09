package com.qa.stringthings;

public class StringsNthat {

	public static void main(String[] args) {
		String yest = "Yesterday it was raining";
		String tod = "Today it is sunny";

		System.out.println(tod.toUpperCase() + ", " + yest.toUpperCase());

		System.out.println(tod.substring(0, 12).toUpperCase() + yest.substring(17).toUpperCase());

		methodOneHard("word          word");

	}

//	public static int wordCount() {
//		
//	}

	// Katie's method
	public static void methodOneHard(String input) {
		int wordCount = 0;
		for (int i = 0; i < input.length(); i++) {
			if ((input.substring(i, (i + 1)).equals(" "))) {
				wordCount++;
			}
		}
		System.out.println("There are " + (wordCount + 1) + " words in this string");

	}

}
