package com.syntax.class04;

public class moreNestedifs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean exam = true;
		int score = 90;
		
		if(exam) {
			System.out.println(" Let's Check your Grade.");
			if(score>=90) {
				System.out.println("Your Score is A");
			}
		}else {
			System.out.println("You should have taken the test");
		}

	}

}
