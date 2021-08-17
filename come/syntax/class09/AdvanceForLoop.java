package come.syntax.class09;

public class AdvanceForLoop {

	public static void main(String[] args) {
		
//Advance for loops only can be used with arrays and collection which we will learn later on.
		
		String[]cars= {"Tesla", "Toyota", "Jeep", "Acura", "Mazda", "Mitsubishi"};
		for(String car:cars) {
			System.out.println(car);
			//---------------------------------------------------------------------------
			
			
			
			
		}
		
		int[]numbers= {1,4,2,6,4,7,8};
		for(int num:numbers) {
			System.out.println(num);
		}
		
		
		
		
		//--------------------------------------------------------------------------------
		char[]grades= {'A','B','C','D','E','F',};
		for(char g:grades) {
			System.out.print(g+" ");
			
		}
		System.out.println();
		
		
		char[]grade= {'A','B','C','D','E','F',};
		for(int i=grade.length-1; i>=0; i--) {
			System.out.print(grade[i]+" ");
		}
	}

}
