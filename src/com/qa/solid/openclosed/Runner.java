package com.qa.solid.openclosed;

import com.qa.solid.openclosed.greetings.CasualGreeting;

public class Runner {

	public static void main(String[] args) {

		CasualGreeting hi = new CasualGreeting();
		Greeter neil = new Greeter(hi);

		System.out.println(neil.getGreeting().greet());

	}

}
