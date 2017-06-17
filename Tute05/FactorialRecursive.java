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

 Answer : Recursive
*/
 import java.util.Scanner;

 class FactorialRecursive{
 	private static long getFactorial(int number){
 		if(number <= 1){
 			return 1;
 		}
 		else{
 			return getFactorial(number - 1) * number;
 		}

 	}
 	public static void main(String args[]){
 		Scanner keyboardScanner = new Scanner(System.in);
 		System.out.print("Enter an Inteher : ");
 		int number = keyboardScanner.nextInt();
 		System.out.println(getFactorial(number));
 	}
 }