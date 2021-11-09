package com.qa.persons;

public class Person {

	private String height;
	private String name;
	private int shoeSize;
	private String jobTitle;
	private int age;

	public Person(String height, String name, int shoeSize, String jobTitle, int age) {
		this.height = height;
		this.name = name;
		this.shoeSize = shoeSize;
		this.jobTitle = jobTitle;
		this.age = age;
	}

	public Person(String height, String name) {
		this.height = height;
		this.name = name;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getShoeSize() {
		return shoeSize;
	}

	public void setShoeSize(int shoeSize) {
		this.shoeSize = shoeSize;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void introduction() {
		System.out.println("HELLO!!! My name is " + getName() + " and I am " + getAge() + " years old.");
	}

	public void jobIntro() {
		System.out.println("HELLO!!! I'm " + getName() + " and I'm a very important " + getJobTitle() + "!!!");
	}

	@Override
	public String toString() {
		return "Person [height=" + height + ", name=" + name + ", shoeSize=" + shoeSize + ", jobTitle=" + jobTitle
				+ ", age=" + age + "]";
	}

}
