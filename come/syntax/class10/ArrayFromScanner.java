package come.syntax.class10;
import java.util.Scanner;
public class ArrayFromScanner {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("How many elements you want in the array? ");
		int size=input.nextInt();
		int[]numbers=new int[size];
		for(int i=0; i<size; i++) {
			System.out.println("Please enter value to be stored in the index "+i);
			numbers[i]=input.nextInt();
			
			
			}
		for(int num:numbers) {
			System.out.print(num+" ");
			
		}
	}

}
