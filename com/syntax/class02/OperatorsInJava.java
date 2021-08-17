package com.syntax.class02;

public class OperatorsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// In java we can do +,-,*,/ and modulus% to solve our problems.
       double num1=221.100;
       double num2= 32.40;
       double result1 = num1+num2;
       double result2 = num1-num2;
       double result3 = num1* num2;
       double result4 = num1/num2;
       
       
        
		System.out.println(" The addition of two numbers "+ num1 + " and "+ num2+ " is equals = "+result1);
		System.out.println(" The subtruction of two numbers "+ num1 + " and "+ num2+ " is equal = "+ result2);
		System.out.println(" The multiplication of two numbers "+ num1 + " and "+ num2+ " is equals = "+result3);
		System.out.println(" The division of two numbers " +num1+ " and "+ num2 + " is equal = "+result4);
		
		
		
		double square;
		square = 3.9;
		System.out.println("The square of the " + square+ " is = 1.9748" );
		
		
		int width = 5;
		int height = 8;
		int area = 40;
		int premiter= 2*(width+height);
		System.out.println(" The premiter of a rectangal with width of " + width + ", height of " +height+ " and area of " + area+ " is = " + premiter);
	
	}

}
