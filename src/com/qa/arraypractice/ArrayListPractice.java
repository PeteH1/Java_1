package com.qa.arraypractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListPractice {

	public static void main(String[] args) {

		List<String> cats = new ArrayList<>();

		cats.add("Nigel");
		cats.add("Susan");
		cats.add("Mr Tibbles");
		cats.add("Mrs Norris");
		cats.add("A Mystery Cat");

		System.out.println(cats);

		// For Loop
		for (int i = 0; i < cats.size(); i++) {
			System.out.println(cats.get(i));
		}

		// Enhanced For Loop
		for (String cat : cats) {
			System.out.println(cat);
		}

		System.out.println(cats.get(2));

		cats.set(0, "Zorg");
		System.out.println(cats.get(0));

		cats.remove(1);

		Collections.sort(cats);
		System.out.println(cats);

		Collections.reverse(cats);
		System.out.println(cats);

		Collections.swap(cats, 0, 1);
		System.out.println(cats);

	}

}
