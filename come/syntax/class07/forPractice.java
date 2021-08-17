package come.syntax.class07;

import java.util.Scanner;

public class forPractice {

	public static void main(String[] args) {
		// Program#1:-----------------------------------------------------------------------------------------------
		int even = 0;
		int odd = 0;

		for (int num = 1; num <= 100; num++) {
			if (num % 2 == 0) {
				even += num;
			} else {
				odd += num;
			}
		}
		System.out.println("The sum of even numbers is " + even);
		System.out.println("The sum of odd numbers is " + odd);

		// Program#2:-----------------------------------------------------------------------------------------------

		Scanner input = new Scanner(System.in);
		int userinput = 0;

		do {
			System.out.println("Pleay pay the price of candy!");
			userinput = input.nextInt();
			if (userinput > 3) {
				System.out.println("Please give less money!");
			} else if (userinput < 3) {
				System.out.println("Please give more money");
			}
		} while (userinput != 3);
		{
			System.out.println("Please enjoy your candy");
		}
		
	}

}
