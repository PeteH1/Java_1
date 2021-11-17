package com.qa.solid.openclosed;

import com.qa.solid.openclosed.greetings.DefaultGreeting;

public class Greeter {

	private Greeting greeting;

	public Greeter() {
		this.greeting = new DefaultGreeting();
	}

	public Greeter(Greeting greeting) {
		this.greeting = greeting;
	}

	public Greeting getGreeting() {
		return greeting;
	}

	public void setGreeting(Greeting greeting) {
		this.greeting = greeting;
	}

}
