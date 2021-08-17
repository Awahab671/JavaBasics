package come.syntax.class09;

public class HomeWork {

	public static void main(String[] args) {
		// Program#1-1---------------------------------------------------------------------------
		String[] cars = { "Tesla", "Chrysler", "Toyota", "Acura", "Mercedes Benz", "Volkswagen" };
		int size = cars.length;
		for (String name : cars) {
			System.out.println(name);

		}
		System.out.println();
		// Program#1-2---------------------------------------------------------------------------
		String[] brands = { "Tesla", "Chrysler", "Toyota", "Acura", "Mercedes Benz", "Volkswagen" };
		int s = brands.length;
		for (int i = 0; i < s; i++) {
			System.out.println(brands[i]);
		}
		System.out.println();
		// Program#2-1---------------------------------------------------------------------------
		String[] animals = { "Lion", "Tiger", "Elephant", "Zebra", "Horse", "Sparrow" };
		int quantity = animals.length;
		for (int a = 0; a < quantity; a++) {
			System.out.println(animals[a]);
		}

		System.out.println();
		// Program#2-2---------------------------------------------------------------------------
		String[] animal = { "Lion", "Tiger", "Elephant", "Zebra", "Horse", "Sparrow" };
		for (String j : animal) {
			System.out.print(j + ", ");
		}

		System.out.println();
		System.out.println();
		// Program#3---------------------------------------------------------------------------
		double[] price = { 12.33, 45.5, 99.23, 55.67 };
		for (int p = price.length - 1; p >= 0.0; p--) {
			System.out.println(price[p]);
		}

		System.out.println();
		// Program#4---------------------------------------------------------------------------

		int[] d = { 34, 54, 66, 21, 56, 76 };
		int sum = 0;
		for (int i = 0; i < d.length; i++) {
			sum = sum + d[i];
			
			
			
		}
		System.out.println("The sum of array d = " + sum);

		System.out.println();
		// Program#5---------------------------------------------------------------------------
		int[] y = { 23, 87, 90, 65, 87, 21 };
		int largestnum = y[0];
		for (int i = 0; i < y.length; i++) {
			if (y[i] > largestnum) {
				largestnum = y[i];
			}
		}
		System.out.println("The largest number in array y = " + largestnum);
	}

}
