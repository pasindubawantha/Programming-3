/*
Compiled on:
java version "1.8.0_121"
Java(TM) SE Runtime Environment (build 1.8.0_121-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.121-b13, mixed mode)

Qection :
2. Write and run a Java program that enters a 10- digit string as a typical U.S. telephone number,
extracts the 3-digit area code, the 3-digit “exchange” and the remaining 4-digit number as separate
strings, prints them and then prints the complete telephone number in the usual formatting.
*/
import java.util.Scanner;

class tellNumber{
	public static void main(String args[]){
		Scanner keyboardScanner = new Scanner(System.in);
		System.out.print("Enter 10-digit telephone number: ");
		String telephoneNumber = keyboardScanner.nextLine();
		if(telephoneNumber.length() == 10){//error checking for invalid telephone number
			String areaCode = "", exchange = "", number = "";
			boolean validNumber = true;
			tellNumber mynumber = new tellNumber();
			for(int i = 0; i < 10; i++){
				char currentDigit = telephoneNumber.charAt(i);
				if(mynumber.isDigit(currentDigit)){// error checking for invalid telephone number
					if(i < 3){
						areaCode += currentDigit;
					}
					else if(i < 6){
						exchange += currentDigit;
					}
					else{
						number += currentDigit;
					}
				}
				else{
					System.out.println("Invalid digit in telephone");
					validNumber = false;
					break;
				}

			}
			if(validNumber){// proceed only for valid numbers
				System.out.println("You entered " + telephoneNumber);
				System.out.println("The area code is " + areaCode);
				System.out.println("The exchange is " + exchange);
				System.out.println("The number is " + number);
				System.out.println("The complete telephone number is (" + areaCode + ") " + exchange + "-" + number);
			}

		}
		else{
			System.out.println("Invalid telephone number, please enter a number with 10 digits");
		}
	}

	static boolean isDigit(char digit){
		int charAscci = (int) digit;
		if((int) '0' <= digit && digit <= (int) '9'){
			return true;
		}
		else{
			return false;
		}
	}
}