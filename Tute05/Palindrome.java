/*
Compiled on:
java version "1.8.0_121"
Java(TM) SE Runtime Environment (build 1.8.0_121-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.121-b13, mixed mode)

Qection :
1) Write a java program to find a given number is palindrome or not?
 Example:
 Enter Number: 12321
 Print: The Number is palindrome
 Enter Number: 1232123
 Print: The Number is not palindrome
*/
import java.util.Scanner;
class Palindrome{
		public static void main(String args[]){
		Scanner keyboardScanner = new Scanner(System.in);
		System.out.print("Enter an Integer : ");
		String inputNumber = keyboardScanner.nextLine();
		boolean isPalindrome = true;
		for(int i = 0; i < (inputNumber.length()/2) - 1 ; i++){
			if(inputNumber.charAt(i) != inputNumber.charAt(inputNumber.length() - i - 1) ){
				System.out.println("The Number is not a palindrome");
				isPalindrome = false;
			}
		}
		if(isPalindrome){
			System.out.println("The Number is a palindrome");
		}
	}

}