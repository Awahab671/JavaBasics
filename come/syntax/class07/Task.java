package come.syntax.class07;

public class Task {

	public static void main(String[] args) {
		// #1
		for (int num = 1; num <= 100; num++) {
			System.out.print(num + " ");
		}

		System.out.println();
		// #2
		for (int num2 = 100; num2 >= 1; num2--) {
			System.out.println(num2);
		}
		System.out.println();

		// #3
		for (int num3 = 20; num3 >= 1; num3 -= 2) {

			if (num3 % 2 == 0)
				System.out.println(num3);
		}
		System.out.println();

		for (int num4 = 2; num4 <= 20; num4 += 2) {

			if (num4 % num4 == 0)
				System.out.println(num4);
		}
		System.out.println();

		// #4
		for (int num5 = 21; num5 <= 50; num5 += 2) {

			if (num5 % 2 == 1)
				System.out.println(num5);
		}
		System.out.println();

		for (int num5 = 49; num5 >= 20; num5 -= 2) {

			if (num5 % 2 == 1)
				System.out.println(num5);
		}
		System.out.println();

	}

}
