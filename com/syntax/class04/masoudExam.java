package com.syntax.class04;
import java.util.Scanner;
public class masoudExam {
public static void main(String [] args) {
Scanner input=new Scanner(System.in);	
	String color= "green";
	String color1= "blue";
	String color2="yellow";
	String color3= "black";
	
	System.out.print("please enter your favourite color:");
	String favourite=input.nextLine();
	if (favourite.equals(color)) {
		System.out.println("we got your favourite color");
	}else if(favourite.equals(color1)) {
		System.out.println("we got your favourite color");
	}else if( favourite.equals(color2)) {
		System.out.println("we got your favourite color");
	}else if(favourite.equals(color3)) {
		System.out.println("we got your favourite color");
	}else {
		System.out.println("we don't have your favourite color in our menue");
	}
	
	
}

}
