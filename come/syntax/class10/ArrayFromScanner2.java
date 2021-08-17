package come.syntax.class10;

import java.util.Scanner;

public class ArrayFromScanner2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("How many elements you want in the array? ");
		int size = input.nextInt();
		double sum=0.0;
		double[] numbers = new double[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Please enter value to be stored in the index " + i);
			numbers[i] = input.nextDouble();
			sum+=numbers[i];
		}
		
		System.out.println("The sum of double numbers is " + sum);
	}

}
