package com.syntax.class04;
import java.util.Scanner;
class Main{
  public static void main(String[]args){
  Scanner input = new Scanner(System.in);


  System.out.println("Please enter a number");

  int number = input.nextInt();

  int mod = number%2;

  if(mod==0){

    System.out.println("Value is even");
 if(mod==1){

    System.out.println("Value is odd");

  }
}

if( number<1000){

      System.out.println("Odd value is just right");

    }
    else if(number>1000){

      System.out.println("Even value is large");
    }

  

   }

}