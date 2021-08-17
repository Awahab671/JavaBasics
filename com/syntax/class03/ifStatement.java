package com.syntax.class03;

public class ifStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Casting in java can happen in primitive and non premitive data types.
		
		// we have two types of casting,
		
		// 1: Widening and Automatic = byte => short => int => long => float => double.
		
		// Widening which means implicit and automatic. Example: double value = 1000 ( the print out would be 1000.0) because it was stored in a decimal data type. 
		
		// 2: Narrowing or explicit manual = double -> float -> long -> int -> short -> byte
		
		// Example:int value = 1.99; ( the value in print out would be 1)because we are narrowing and when narrowing we fit something big into a smaller box and data could be lost
		
		// Narrowing which means implicit and manual.
		
		int num1 = 20;
		int num2 = 3;
		
		System.out.println(num1/num2);
		
		double num3 = 20;
		double num4 = 3;
		
		System.out.println( num3/num4);
		
		float number = 1.99f;
		double number2 = 1.88;
		
		System.out.println(number/number2);
		
		
		
		
	}

}
