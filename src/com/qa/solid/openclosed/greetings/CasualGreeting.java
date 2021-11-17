package com.qa.solid.openclosed.greetings;

import com.qa.solid.openclosed.Greeting;

public class CasualGreeting implements Greeting {

	@Override
	public String greet() {
		return "Sup, m8?";
	}

}
