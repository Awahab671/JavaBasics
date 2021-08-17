package come.syntax.class08;

import java.util.Scanner;

public class morePracticeOfLoops {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String item = null;
		int itemPrice = 0;
		int change = 0;
		int money = 0;
		System.out.println("Please enter name of the item you want: ");
		item = input.nextLine();
		System.out.println("Please enter price of the item: ");
		itemPrice = input.nextInt();
		System.out.println("Please pay for the item: ");
		do {

			money = input.nextInt();
			if (money < itemPrice) {
				money = itemPrice - money;
				System.out.println("You need to pay " + money + " dollars more to cover the price.");

			} else if (money > itemPrice) {
				change = money - itemPrice;
				System.out.println("Your change is $" + change);
				break;
			} else {
				System.out.println("You paid the price");
			}
		} while (money != itemPrice);
		{
			System.out.println("please collect your item.");
		}
	}

}

