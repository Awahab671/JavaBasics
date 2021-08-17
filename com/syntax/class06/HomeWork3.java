package com.syntax.class06;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {

		// Task#3:.................................................................................
		double num1;
		double num2;
		double result = 0;
		String operator;

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter two numbers: ");
		num1 = input.nextDouble();
		num2 = input.nextDouble();
		System.out.println("Now enter the operator: +, -, /, * : ");
		operator = input.next();

		if (operator.equals("+")) {
			result = num1 + num2;

		} else if (operator.equals("-")) {
			result = num1 - num2;
		} else if (operator.equals("/")) {
			result = num1 / num2;
		} else if (operator.equals("*")) {
			result = num1 * num2;
		}
		{
			System.out.println("The result of this operation is " + result);
		}
		// Task#4a:................................................................................

		double num4;
		double num5;
		double operation = 0;
		String type;
		input = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		num4 = input.nextDouble();
		System.out.println("Please enter the second number: ");
		num5 = input.nextDouble();
		System.out.println("Now enter the operator: =, -, /, * ");
		type = input.next();

		switch (type) {
		case "+":
			operation = num4 + num5;
			break;
		case "-":
			operation = num4 - num5;
			break;
		case "*":
			operation = num4 * num5;
			break;
		case "/":
			operation = num4 / num5;
			break;

		}
		System.out.println("The result of this operation is " + operation);

	}

}
