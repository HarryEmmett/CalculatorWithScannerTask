package com.qa.community;

import java.util.Scanner;

public class Menu {

	public static void menu() {

		boolean playing = true;
		Scanner scan = new Scanner(System.in);
		while (playing) {
			
			System.out.println("Welcome to the calculator!");
			System.out.println("=".repeat(75));
			
			System.out.print("Input a number: ");
			int x = scan.nextInt();
			
			System.out.print("Input a second number: ");
			int y = scan.nextInt();
			
			System.out.println("=".repeat(75));
			System.out.println("Choose operator");
			System.out.println("1) addition");
			System.out.println("2) subtraction");
			System.out.println("3) multiplication");
			System.out.println("4) division");
			System.out.println("5) exit");
			System.out.println("=".repeat(75));
			
			int userchoice = scan.nextInt();
			System.out.println("=".repeat(75));

			switch (userchoice) {
			case 1:
				System.out.print("You added " + x + " + " + y + " and the answer is: ");
				System.out.println(Calculator.add(x, y));
				playing = false;
				break;
			case 2:
				System.out.print("You subtracted " + x + " - " + y + " and the answer is: ");
				System.out.println(Calculator.subtract(x, y));
				playing = false;
				break;
			case 3:
				System.out.print("You multiplied " + x + " x " + y + " and the answer is: ");
				System.out.println(Calculator.multiply(x, y));
				playing = false;
				break;
			case 4:
				System.out.print("You divided " + x + " / " + y + " and the answer is: ");
				System.out.println(Calculator.divide(x, y));
				playing = false;
				break;
			case 5:
				System.out.println("Thanks for playing!");
				playing = false;
				break;
			default:
				System.out.println("Incorrect input! Try again.");
				System.out.println("=".repeat(75));
				menu();
			}

		}

	}
}
