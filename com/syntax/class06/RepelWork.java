package com.syntax.class06;

import java.util.Scanner;

public class RepelWork {
	public static void main(String[]args) {

	Scanner input = new Scanner(System.in);
	System.out.println("Please enter the name of your favorite country you wish to visit: ");
	String country = input.nextLine();
	String bestPlace = null;
	
	switch(country) {
	case "Afghanistan":
		 bestPlace = "Herat province";
		 break;
	case "United States":
		 bestPlace = "California State";
		 break;
	case "Middle East":
		 bestPlace = "Dubai";
		 break;
	default:
		bestPlace = "Not a country!";
		break;
	}
	System.out.println("Since you wish to visit "+country+" don't forget to go to "+bestPlace+" in "+country);
	}

}