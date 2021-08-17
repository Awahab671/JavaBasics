package come.syntax.class11;

public class Practice {

	public static void main(String[] args) {

		int[][] twoD = { { 14, 24, 67, 81, 99 }, { 12, 8, 87, 21, 19 }, { 10, 20, 65, 71, 400 }, };
		int sumofOdd = twoD[0][0];
		int sumofEven = twoD[0][0];

		for (int a = 0; a < twoD.length; a++) {
			for (int b = 0; b < twoD[a].length; b++) {
				if (twoD[a][b]%2==1) {
					sumofOdd += twoD[a][b];
				} else if (twoD[a][b] %2==0) {
					sumofEven += twoD[a][b];
				}
			}
		}
		System.out.println("Sum of odd numbers is = " + sumofOdd+ " and sum of even number is = " + sumofEven);
		
		
		
		int [][] num ={{1, 2, 3, 5}, {6, 7, 9}};
		int evenNum;
		for(int i=0; i<num.length; i++){
		for(int j=0; j<num[i].length; j++){
		if(num[i][j]%2==0){
		evenNum=num[i][j];
		System.out.println(evenNum+" ");
	}
}
		}
		}
}
	