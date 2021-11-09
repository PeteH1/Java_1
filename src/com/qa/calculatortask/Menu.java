package com.qa.calculatortask;

import java.util.Scanner;

public class Menu {

	Scanner scan = new Scanner(System.in);

	public void menu() {

		boolean menuCheck = true;
		int num1;
		int num2;
		int menuChoice;

		System.out.println("HeLlO aNd WeLcOmE tO pEtE's WoNdErFuL cAlCuLaToR pRoGrAm!!!!!!1!!");

		while (menuCheck) {
			System.out.println("And what operation would you like to perform?");
			System.out.println("=".repeat(50));
			System.out.println("\t1). Addition");
			System.out.println("\t2). Subtraction");
			System.out.println("\t3). Multiplication");
			System.out.println("\t4). Division");
			System.out.println("=".repeat(50));
			System.out.println("\tEnter any other number to exit.");

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
