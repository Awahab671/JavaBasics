package com.syntax.class05;

import java.util.Scanner;

public class PracticeLogicalOperators {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Is it sale: ");
		String answer = input.nextLine();
		String item = null;
		int discount = 0;
		int finalPrice = 0;
		if (answer.equals("yes")) {
			System.out.println("What is the price of the table");
			int price = input.nextInt();
			if (price < 20) {
				discount = 10;
			} else if (price >= 20 && price <= 100) {
				discount = 20;
			} else if (price >= 100 && price <= 500) {
				discount = 30;
			} else {
				discount = 50;
			}finalPrice = (price/100)*discount-price;
		}System.out.println(" the final price after "+discount+"% is: "+finalPrice);

		 {
		 else{System.out.println("I am not going for shopping");}
		}

	}

}







Scanner scan = new Scanner(System.in);
String sale;
double price;
int discount=0;
double finalPrice;

System.out.println(“Is there a sale now?“);
sale = scan.nextLine();

if(sale.equals(“yes”)) {

System.out.println(“What you would like to purchase?“);
      String item = scan.nextLine();

System.out.println(“What is the price for item?“);
price = scan.nextDouble();

if (price >=1 && price < 20) {
discount = 10;
} else if (price >= 20 && price <100) {
discount = 20;
} else if (price >=100 && price <500) {
discount = 30;
}else if (price >500) {
discount = 50;
}

finalPrice=price-(price*discount/100);

System.out.println(“After discount “+discount+“% the price of the “+item
+ ” reduced from $“+price+” to “+finalPrice);

}else {
System.out.println("Sorry, no shopping today !");
}