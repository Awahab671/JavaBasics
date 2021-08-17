package come.syntax.class08;

import java.util.Scanner;

class Practice {
  public static void main(String[] args) {
   Scanner input=new Scanner(System.in);
   System.out.println("Enter a number: ");
   int x = input.nextInt();
   int i=x;
   for (x=x; x>=0; --x ){
	   if(i==x) {
		   continue;
	   }
     System.out.print(x+" ");
    
   }
   }
  }
