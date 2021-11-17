package com.qa.solid.openclosed.greetings;

import com.qa.solid.openclosed.Greeting;

public class FormalGreeting implements Greeting {

	@Override
	public String greet() {
		return "Good evening, Sir.";
	}

}
