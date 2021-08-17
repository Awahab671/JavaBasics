package com.syntax.class04;

public class elseifWM {

	public static void main(String[] args) {

		int cash = 400;
		int borrowed = 1000;

		if (cash == borrowed) {
			System.out.println("You are a resposible person!");
		} else if (cash > borrowed) {
			System.out.println("You don't need to borrow money");
		} else if (cash < borrowed) {
			System.out.println("You have to borrow money!");
		} else if (cash != borrowed) {
			System.out.println("You are a not a responsible person!");
		}
	}

}
