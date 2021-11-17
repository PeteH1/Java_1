package com.qa.solid.depinversion;

public class Runner {

	public static void main(String[] args) {
		BackendDeveloper back = new BackendDeveloper();
		FrontendDeveloper front = new FrontendDeveloper();

		Project proj = new Project();

		proj.implement(back);
		proj.implement(front);

	}
}
