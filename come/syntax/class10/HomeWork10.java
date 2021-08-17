package come.syntax.class10;

public class HomeWork10 {

	public static void main(String[] args) {

		String cars[][] = { { "Chrysler", "Ford", "Tesla", "Cadilac" },
				{ "Mercedes Benz", "BMW", "Volkswagen", "Audi" }, { "Kia", "Hyundai", "Sorento", "Genesis Motors" },
				{ "Ferrari", "Lamborghini", "Fiat", "Alfa Romeo" },

		};
				for (int i = 0; i < cars.length; i++) {
			for (int j = 0; j < cars[i].length; j++) {
				System.out.println(cars[i][j]);
			}
		}
		System.out.println("-----------------------------------------------------------------------------------------");

		for (String[] companies : cars) {
			for (String name : companies) {
				System.out.println(name + " ");
			}

		}
		System.out.println("-----------------------------------------------------------------------------------------");
		String grocery[][] = { { "Carrot", "Spinach", "Mashroom", "Cauliflower" },
				{ "Apple", "Orange", "Mango", "Watermelon" }, { "Milk", "Cheese", "Yougurt", "Butter" },
				{ "Cookie", "Cake", "Choclate", "Ice cream" }, };

		for (int p = 0; p < grocery.length; p++) {
			for (int w = 0; w < grocery[p].length; w++) {
				System.out.println(grocery[p][w] + " ");
			}
		}
		System.out.println("-----------------------------------------------------------------------------------------");

		for (String[] type : grocery) {
			for (String z : type) {
				System.out.println(z + " ");
			}
		}

	}

}
