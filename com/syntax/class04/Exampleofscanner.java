package com.syntax.class04;

import java.util.Scanner;

public class Exampleofscanner {

	public static void main(String[] args) {
		/*String name = "Wahab";
        System.out.println("Hello "+name);	
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter you name:");
	    String value=scan.nextLine();	
	    System.out.println(" I captured "+value);*/
		

	    
	    
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Please enter your name:");
	    String name = scan.nextLine();
	    System.out.println("Hello "+name);
	    System.out.println("Please enter you age: ");
	    int age = scan.nextInt();
	    System.out.println(name+" is "+ age+" years old.");
	    
	    
	}

}
