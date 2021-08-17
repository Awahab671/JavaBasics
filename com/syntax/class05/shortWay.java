package com.syntax.class05;
import java.util.Scanner;

public class shortWay {

		

		public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);
			System.out.println("Please Enter three numbers:");
			
			int number1, number2,number3, largest;
			
		    number1 = input.nextInt();
		    number2 = input.nextInt();
		    number3 = input.nextInt();
		    
		    if(number1 > number2 && number1>number3) {
		    	largest = number1;
		    }else if(number2>number1 && number2>number3) {
		    	largest = number2;
		    }else{
		    	largest = number3;System.out.println(largest+" is the largest number");
		    }if(largest%2==0) {
		    	System.out.println(largest+" is the largest number and it's even number");
		    	
		    }
			

		}

	}


