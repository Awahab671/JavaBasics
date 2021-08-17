package com.syntax.class04;

import java.util.Scanner;

public class homeWork {

	public static void main(String[] args) {
		// Loan Application Program:

		Scanner input = new Scanner(System.in);
		System.out.println("What is the amount of loan you need: ");
		int amount = input.nextInt();
		if (amount <= 200000) {

			System.out.println(" You are apporved for the loan.");

		} else {

			System.out.println(" We are sorry but we can't approve your application at this moment.");
		}

		// DMV Program:

		Scanner info = new Scanner(System.in);
		System.out.println(" What is your age: ");
		int age = info.nextInt();
		if (age >= 18) {
			System.out.println(" You are eligible to apply for a Driver's License.");
		} else {

			System.out.println(
					" You are not eligible to apply for a Driver's License however you can apply for a permit while you are under 18 years old.");
		}

		// Tempreture program:

		Scanner add = new Scanner(System.in);
		System.out.println("In which city do you live in?");
		String city = add.nextLine();
		System.out.println("What is the current tempreture in your city?");
		int temp = add.nextInt();
		int celcious = (temp - 32) * 5 / 9;
		System.out.println(" The tempreture in " + city + " is " + celcious + " Celcious");

	}

}
