package come.syntax.class08;

import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter two numbers for the range of my interger: ");
		int startingPoint = 0;
		int endingpoint = 0;
		int even = 0;
		int odd = 0;
		 startingPoint = input.nextInt();
		 endingpoint = input.nextInt();
		for(int i= startingPoint; i<=endingpoint; i++ ) {
		  if(i%2==0) {
			 even+=i;
			
		  }else{
			  odd+=i;
		  }
		}
		System.out.println("The sum of even numbers is "+even);
		System.out.println("The sum of odd numbers is "+odd);	
		
	}

}
//Analyze this exercise.

















