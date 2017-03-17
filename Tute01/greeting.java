/*
Qection :
1. Write and run a Java program that prompts the user for his or her last name and first name
separately and prints a greeting like this:
Enter your last name: Perera
Enter your first name: Chathura
Hello, Chathura Perera
*/
import java.util.Scanner;

class greeting{
	public static void main(String args[]){
		Scanner keyboardScanner = new Scanner(System.in);
		System.out.print("Enter your last name: ");
		String lastName = keyboardScanner.nextLine();
		System.out.print("Enter your first name: ");
		String firstName = keyboardScanner.nextLine();
		System.out.println("Hello, " + firstName + " " + lastName);
	}
}