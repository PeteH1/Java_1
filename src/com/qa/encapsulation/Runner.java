package com.qa.encapsulation;

public class Runner {

	public static void main(String[] args) {
		Encapsulation nigel = new Encapsulation();

		nigel.setName("Nigel");
		nigel.setFavNumber(420);
		nigel.setDoubleNum(123.45);
		nigel.setFloatNum(99.99f);
		nigel.setLongNum(987654321L);

		System.out.println("I've just made " + nigel.getName());
		System.out.println(nigel.getFavNumber());
		System.out.println(nigel.getDoubleNum());
		System.out.println(nigel.getFloatNum());
		System.out.println(nigel.getFloatNum());
		System.out.println(nigel.getLongNum());

		System.out.println(nigel);
	}
}
