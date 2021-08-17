package com.syntax.class05;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {

		// First Program
		Scanner input = new Scanner(System.in);
		int quiz, midTerm, finalScores;
		char grade = 0;
		System.out.println("Please enter your score for quiz:");
		quiz = input.nextInt();
		System.out.println("Please enter your score for midTerm:");
		midTerm = input.nextInt();
		System.out.println("Please enter your score for the final exam:");
		finalScores = input.nextInt();
		int average = quiz + midTerm + finalScores;
		average = average / 3;
		if (average >= 90) {
			grade = 'A';
		} else if (average >= 70 && average < 90) {
			grade = 'B';
		} else if (average >= 50 && average < 70) {
			grade = 'C';

		} else if (average < 50) {
			grade = 'F';
		}
		System.out.println("With average score of " + average + " your grade is " + grade);

		// Second Program:

		input = new Scanner(System.in);
		String month;
		System.out.println("Please enter your birth month: ");
		month = input.nextLine();

		if (month.equals("january") || month.equals("february") || month.equals("march")) {
			System.out.println("You were born in winter season.");
		} else if (month.equals("april") || month.equals("may") || month.equals("june")) {
			System.out.println("You were born in spring season.");
		} else if (month.equals("july") || month.equals("august") || month.equals("september")) {
			System.out.println("You were born in summer season.");
		} else if (month.equals("october") || month.equals("november") || month.equals("december")) {
			System.out.println("You were born in fall season.");
		}

		// Third Program:

		input = new Scanner(System.in);
		int number1, number2, number3, largest;
		System.out.println("Please enter three distinct numbers for comparison: ");
		number1 = input.nextInt();
		number2 = input.nextInt();
		number3 = input.nextInt();
		if (!(number1 == number2 && number2 == number3)) {
			if (number1 > number2 && number1 > number3) {	
              largest = number1;
			} else if (number2 > number1 && number2 > number3) {
				largest = number2;
			} else {
				largest = number3;
			}
			System.out.println("the largest number is "+largest);
             
		}else {
			System.out.println("You did not enter three distinct numbers.");
		}
	}
}
