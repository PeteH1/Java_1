package com.qa.persons;

public class Runner {

	public static void main(String[] args) {

		Person pete = new Person("300 METERS TALL", "Pete", 9, "Software person", 27);
		Person nigel = new Person("teeeenie tiny", "Nigel", 4, "Angry Man", 52);
		Person susan = new Person("160cm", "Susan", 3, "Space Marine", 34);
		Person liz = new Person("Royal height", "Elizabeth Windsor", 15, "Queen of UK", 95);

		pete.introduction();
		nigel.jobIntro();
		liz.introduction();
		susan.jobIntro();

		System.out.println(pete.toString());
		System.out.println(nigel.toString());
		System.out.println(susan.toString());
		System.out.println(liz.toString());

	}

}
