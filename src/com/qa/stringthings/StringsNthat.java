package com.qa.stringthings;

public class StringsNthat {

	public static void main(String[] args) {
		String yest = "Yesterday it was raining";
		String tod = "Today it is sunny";

		System.out.println(tod.toUpperCase() + ", " + yest.toUpperCase());

		System.out.println(tod.substring(0, 12).toUpperCase() + yest.substring(17).toUpperCase());

	}

//	public static int wordCount() {
//		
//	}

}
