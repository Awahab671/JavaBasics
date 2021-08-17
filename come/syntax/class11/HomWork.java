package come.syntax.class11;

public class HomWork {

	public static void main(String[] args) {
		// Task#7-1: Find the maximum and minimum number in the array.
		int[] array = { 12, 24, 67, 800, 99 };
		int maximum = array[0];
		int minimum = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maximum) {
				maximum = array[i];
			} else if (array[i] < minimum) {
				minimum = array[i];
			}
		}
		System.out.println(" The largest number in one dimensional array is = " + maximum+ " and the smallest number is = " + minimum);
		System.out.println();

		// Task#7-2: find maximum and minimum number in two dimensional array:

		int[][] twoDarr = { { 14, 24, 67, 81, 99 }, { 12, 8, 87, 21, 19 }, { 10, 20, 65, 71, 400 }, };
		int max = twoDarr[0][0];
		int min = twoDarr[0][0];

		for (int i = 0; i < twoDarr.length; i++) {
			for (int j = 0; j < twoDarr[i].length; j++) {
				if (twoDarr[i][j] > max) {
					max = twoDarr[i][j];
				} else if (twoDarr[i][j] < min) {
					min = twoDarr[i][j];
				}
			}
		}
		System.out.println("The largest number in two dimensional array is = " + max + " and the smallest number is = " + min);
		
		
		
		
		
		
		
		
		
		
		int[][] twoD = { { 1, 2, 6, 8, 9}, { 1, 8, 8, 2, 1 }, { 10, 2, 5, 7, 4 }, };
		int sumofOdd = twoD[0][0];
		int sumofEven = twoD[0][0];

		for (int a = 0; a < twoD.length; a++) {
			for (int b = 0; b < twoD[a].length; b++) {
				if (twoD[a][b]%2==1) {
					sumofOdd += twoD[a][b];
				} else if (twoD[a][b]%2==0) {
					sumofEven += twoD[a][b];
				}
			}
		}
		System.out.println("The sum of odd numbers is = " + sumofOdd + " and sum of even number is = " + sumofEven);
		
	   }
	}