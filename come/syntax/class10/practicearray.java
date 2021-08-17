package come.syntax.class10;

public class practicearray {

	public static void main(String[] args) {
		String[]country={"Afghanistan", "Tajikistan", "USA", "Japan"};
		int size=country.length;
		for(int i=0; i<size; i++) {
			System.out.println(country[i]);
		}
		String capitals=null;
		for(String capital:country) {
			if(capital.equals("Afghanistan")) {
				capitals="Kabul";
			}
			else if(capital.equals("Tajikistan")) {
				capitals="Dushanbe";
			}else if(capital.equals("USA")) {
				capitals="Washington DC";
			}else if(capital.equals("Japan")) {
				capitals="Tokyo";
			}
			System.out.println("The capital of "+capital+" is "+capitals);
		}
		


	}

}
