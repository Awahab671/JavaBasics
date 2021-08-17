package come.syntax.class10;

public class TwoDimensionalArray {

	public static void main(String[] args) {
	int [][]numbers=new int[3][4];
	//First row of our array.
	numbers[0][0]=23;
	numbers[0][1]=10;
	numbers[0][2]=43;
	numbers[0][3]=54;
	
	//Second row of our array.
	numbers[1][0]=11;
	numbers[1][1]=17;
	numbers[1][2]=51;
	numbers[1][3]=81;
	
	
	//Third row of our array.
	numbers[2][0]=121;
	numbers[2][1]=114;
	numbers[2][2]=118;
	numbers[2][3]=110;
	
	
	
	System.out.println(numbers[1][0]);
	
	// Or we could do it a different way.
	
	int[][]score= {
			
			{12,34,54,65},
			{43,87,9,90,4},
			{18,34,76,98},
	};
	}

}
