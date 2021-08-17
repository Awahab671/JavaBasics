package com.syntax.class04;

import com.sun.tools.javac.jvm.Code;

public class nestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// if (boolean condition) {
		// code comes here
		// this is nested if statement, nested means one if statement into another.
		// if (boolean condition) {

		boolean vaccine = true;
		boolean svaccine = true;
		if (vaccine) {

			System.out.println(" Let's check how many doses you took");
			if (svaccine) {

				System.out.println(" You are fully vaccinated");
			} else {
				System.out.println(" You need to get the second dose");
			}
		}

		int day = 13;
		boolean isFriday = true;

		if (isFriday) {
			System.out.println(" I am goint to watch a movie");

			if (day == 13) {
				System.out.println(" I will watch an Afghan movie");
			}
		} else {
			System.out.println(" I am goint to code");
		}

	}

}
