package com.syntax.class05;
import java.util.Scanner;
public class taskLogicalOperator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your height:");
        int height = input.nextInt();
        
        if (height<60) {
        	System.out.println("Short");
        }else if (height>60 && height <72) {
        	System.out.println("Medium");
        }else if(height>72) {
        	System.out.println("Tall");
        }
        
        
        
        
        
        
        
        
        
        
        int num;
        System.out.println("Please enter a number between 1-7:");
        num = input.nextInt();
        
        if(num>=1 && num<=6) {
        	System.out.println("It's a weekday.");
        	
        }else if(num>5 && num <8) {
        	System.out.println("It's a weekend");
        }else {
        	System.out.println("Invalid number!");
        }
        
       
        
        
	}

}
