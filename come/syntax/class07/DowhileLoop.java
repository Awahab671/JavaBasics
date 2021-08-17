package come.syntax.class07;
import java.util.Scanner;
public class DowhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		Scanner input = new Scanner(System.in);
		int secretNumber = 19;
		int userGuess;
		System.out.println("Guess my secret number: ");
		do {
			userGuess = input.nextInt();
		}while (userGuess != secretNumber);{
			System.out.println("Please try again!");
			}
			System.out.println("Congratulations");
	}
       
}



//this is wrong!
//correct it