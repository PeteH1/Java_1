package com.qa.solid.openclosed.greetings;

import com.qa.solid.openclosed.Greeting;

public class DefaultGreeting implements Greeting {

	@Override
	public String greet() {
		return "Hello";
	}

}
