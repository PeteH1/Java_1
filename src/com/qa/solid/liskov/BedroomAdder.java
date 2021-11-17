package com.qa.solid.liskov;

public class BedroomAdder {

//	Example from QA Community

	/*
	 * There used to be a parent class called "Apartment" that was extended by both
	 * Penthouse & Studio. The method below would then take Apartment as a parameter
	 * and would add a bedroom, but contained an if statement to check that the
	 * apartment wasn't a Studio. This didn't adhere to Liskov because the method
	 * couldn't use all objects of derived classes such as the Studio class.
	 */
	public void addBedroom(Penthouse penthouse) {
		penthouse.setNumberOfBedrooms(penthouse.getNumberOfBedrooms() + 5);
	}

	/*
	 * This example isn't great because it just does away with the hierarchy
	 * altogether. In Liskov, you can still have methods that take parent classes as
	 * a parameter, but they MUST be able to use derived classes without knowing.
	 */

}