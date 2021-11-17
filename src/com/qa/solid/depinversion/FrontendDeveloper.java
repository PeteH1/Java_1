package com.qa.solid.depinversion;

public class FrontendDeveloper implements Developer {

	@Override
	public void writeCode() {
		System.out.println("Javascript is use everywhere anyway.");
	}

}
