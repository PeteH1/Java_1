package com.qa.calculatortask;

import java.util.Scanner;

public class Menu {

	Scanner scan = new Scanner(System.in);

	public static void nicetype(String message) throws InterruptedException {
		char[] chars = message.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			System.out.print(chars[i]);
			Thread.sleep(60);
		}
	}

	public void menu() {

		boolean menuCheck = true;
		int num1;
		int num2;
		int menuChoice;

		String welcome = "HeLlO aNd WeLcOmE tO pEtE's WoNdErFuL cAlCuLaToR pRoGrAm!!!!!!1!!";
		try {
			nicetype(welcome);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		while (menuCheck) {

			String menuText = "\nAnd what operation would you like to perform?\n\t1). Addition\n"
					+ "\t2). Subtraction\n\t3). Multiplication\n\t4). Division\n\tEnter any other number to exit.\n";
			try {
				nicetype(menuText);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			menuChoice = scan.nextInt();
			scan.nextLine();

			switch (menuChoice) {
			case 1:
				System.out.println("Enter first number:");
				num1 = scan.nextInt();
				System.out.println("Enter second number:");
				num2 = scan.nextInt();
				scan.nextLine();
				System.out.println(num1 + " + " + num2 + " = " + Calculator.addition(num1, num2));
				break;
			case 2:
				System.out.println("Enter first number:");
				num1 = scan.nextInt();
				System.out.println("Enter second number:");
				num2 = scan.nextInt();
				scan.nextLine();
				System.out.println(num1 + " - " + num2 + " = " + Calculator.subtraction(num1, num2));
				break;
			case 3:
				System.out.println("Enter first number:");
				num1 = scan.nextInt();
				System.out.println("Enter second number:");
				num2 = scan.nextInt();
				scan.nextLine();
				System.out.println(num1 + " x " + num2 + " = " + Calculator.product(num1, num2));
				break;
			case 4:
				System.out.println("Enter first number:");
				num1 = scan.nextInt();
				System.out.println("Enter second number:");
				num2 = scan.nextInt();
				scan.nextLine();
				System.out.println(num1 + " / " + num2 + " = " + Calculator.division(num1, num2));
				break;
			default:
				menuCheck = false;
				System.out.println("GOODBYE!!!");
				break;
			}
		}
	}

}
