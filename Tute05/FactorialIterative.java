/*
Compiled on:
java version "1.8.0_121"
Java(TM) SE Runtime Environment (build 1.8.0_121-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.121-b13, mixed mode)

Qection :
2) Write the java program to calculate the factorial number both iterative and recursive?

 Example:
 Enter Number: 5
 Print: 120

 Answer : Iterative
*/
 import java.util.Scanner;

 class FactorialIterative{
 	public static void main(String args[]){
 		Scanner keyboardScanner = new Scanner(System.in);
 		System.out.print("Enter an Inteher : ");
 		int number = keyboardScanner.nextInt();
 		long factorial = 1 ; // In java we can't define unsigned Integers so this will go out of boiut for big "numbers"
 		for(int i = 2; i <= number ; i++ ){
 			factorial *= i;
 		}
 		System.out.println(factorial);
 	}
 }