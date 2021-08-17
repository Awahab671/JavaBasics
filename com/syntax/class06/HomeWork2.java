package com.syntax.class06;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {

		// Task#1:---------------------------------------------------------------------------------------------------------------------------------------
		String country, language;
		Scanner input = new Scanner(System.in);
		System.out.println("Where are you from?");
		country = input.nextLine();

		switch (country) {

		case "USA":
			language = "English";
			break;
		case "Afghanistan":
			language = "Dari";
			break;
		case "Malaysia":
			language = "Malaysian";
			break;
		default:
			language = "Country Not Listed!";
			break;
		}
		System.out.println("You are from " + country + " and you speak " + language);

		// Task#2:--------------------------------------------------------------------------------------------------------------------------------------

		char grade;
		String info;

		System.out.println("Please enter your grade using A, B, C or D : ");
		grade = input.next().charAt(0);

		switch (grade) {

		case 'A':
			info = "Excellent";
			break;
		case 'B':
			info = "Good";
			break;
		case 'C':
			info = "Average";
			break;
		case 'D':
			info = "Bad";
			break;
		default:
			info = "Not Acceptable";
			break;
		}
		System.out.println("Your grade is " + grade + " and it is " + info);
	}

}
