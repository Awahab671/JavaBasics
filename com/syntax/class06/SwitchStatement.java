package com.syntax.class06;

public class SwitchStatement {

	public static void main(String[] args) {
		int day = 2;
		String nameOfDay;
		switch(day) {
		
		case 1:
			nameOfDay = "monday";
			break;
		case 2:
			nameOfDay = "Tuesday";
		    break;
		case 3:
			nameOfDay = "Wednesday";
			break;
		case 4: 
			nameOfDay = "Thursday";
			break;
		case 5: 
			nameOfDay = "Friday";
			break;
		case 6:
			nameOfDay = "Saturday";
			break;
		case 7: 
			nameOfDay = "Sunday";
			break;
		default:
			nameOfDay = "Invalid";
		
		}
		System.out.println("Today is "+nameOfDay);

	}

}
