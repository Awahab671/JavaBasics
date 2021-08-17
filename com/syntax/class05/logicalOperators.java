package com.syntax.class05;

public class logicalOperators {
public static void main(String[]args) {

	String day = "Saturday";
	
	if(day.equals("Monday")|| day.equals("Friday")){
		
		System.out.println(" We have no syntax class");
	}else if(day.equals("Tuesday") || day.equals("Wednesday")){
		System.out.println("Today is our review class");
	}else {
		System.out.println("Today is my favourite java class");
	}
	
}
}
