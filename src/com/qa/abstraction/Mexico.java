package com.qa.abstraction;

public class Mexico extends Country implements Hot, Developing, Greeting {

	public void tequila() {
		System.out.println("If someone says Tequila is good for you,\ntake it with a pinch of salt");
	}

	@Override
	public void decDeveloping() {
		System.out.println("I'm developing!!!");
	}

	@Override
	public void random3() {
		String nowt = "This method does nothing";
		nowt.charAt(0);
	}

	@Override
	public void random4() {
		String nowt2 = "This method also does nothing";
		nowt2.charAt(0);
	}

	@Override
	public void declareHot() {
		System.out.println("It's hot in Mexico.");
	}

	@Override
	public void takeOffCoat() {
		System.out.println("Taking off my coat in Mexico.");
	}

	@Override
	public void keepCool() {
		System.out.println("Keeping cool in Mexico.");
	}

	@Override
	public void sayName() {
		System.out.println("I AM MEXICO!!!");
	}

	@Override
	public void greeting() {
		System.out.println("Hola amigo");
	}

}
