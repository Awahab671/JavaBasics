package com.syntax.class04;

import java.util.Scanner;

public class mWPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		String username = "Masoud";
		String password = "Wahab123";

		int age = 18;
		int dateofbirth = 18;

		if (age == dateofbirth) {
			System.out.println("You are too young");

			System.out.println("Please enter the username:");
			username = input.nextLine();

			if (username.equals("Masoud")) {
				System.out.println("Your Username is correct!");

				System.out.println("Please enter your Password");
				password = input.nextLine();

				if (password.equals("Wahab123")) {
					System.out.println("Your password is correct!");
				} else {
					System.out.println("You have entered a wrong password!");
				}

			} else {
				System.out.println("You entered a wrong username!");
			}
		}

		else {
			System.out.println("You are too old");
		}
	}

}
//----------------------------------------------------------------
