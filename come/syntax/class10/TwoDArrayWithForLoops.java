package come.syntax.class10;

public class TwoDArrayWithForLoops {

	public static void main(String[] args) {
		
		String[][]food= {
				
				{"Kabob","Qabeli"},
				{"Shorba", "Sheer brinj", "Palaw"},
				{"Sikh Kabob", "Maash Palaw"}};
		//This prints the rows
		System.out.println(food.length);
		//This prints the columns in first row.
		int sizeofArray= food[0].length;
		System.out.println(sizeofArray);
        //This prints the size of row 4.
	     sizeofArray=food[2].length;
	     System.out.println(sizeofArray);
	     
		
		
	}

}
