package com.syntax.class05;
import java.util.Scanner;
public class notEqualOperator {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter three numbers:");
		
		int number1, number2,number3;
		
	    number1 = input.nextInt();
	    number2 = input.nextInt();
	    number3 = input.nextInt();
	    
	    if(number1 > number2 && number1>number3) {
	    	System.out.println(number1+" is the largest number and it is ");
	    }else if(number2>number1 && number2>number3) {
	    	System.out.println(number2+" is the largest number");
	    }else if(number3>number1 && number3>number2) {
	    	System.out.println(number3+" is the largest number");
	    }else if(number1==number2 && number2==number3) {
	    	System.out.println("Numbers are equal.22");
	    }
		

	}

}
