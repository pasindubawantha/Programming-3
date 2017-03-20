/*
Compiled on:
java version "1.8.0_121"
Java(TM) SE Runtime Environment (build 1.8.0_121-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.121-b13, mixed mode)

Qection :
6) Write and run a Java program that inputs the name of a month and then processes it by:
a) Echoing the input;
b) Extracting the first three letters;
c) Capitalizing them;
d) Printing that abbreviation;
e) Extracting each of the three letters as a separate char variable;
f) Using nested if and if… else statements to identify the number of the month from the char
variables:
g) Print the number of the month.
*/
import java.util.Scanner;

class MonthProcessing1 {
	public static void main(String args[]){
		Scanner keyboardScanner = new Scanner(System.in);
		System.out.print("Enter the month : ");
		String month = keyboardScanner.nextLine();
		System.out.println("You entered " + month);
		String first3Letters = month.substring(0,3);
		first3Letters = first3Letters.toUpperCase();
		System.out.println("Its abbreviation is " + first3Letters);
		char letter1 = first3Letters.charAt(0);
		char letter2 = first3Letters.charAt(1);
		char letter3 = first3Letters.charAt(2);
		int monthNumber = -1;
		/*
		Months : JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC
		A : APR(4), AUG(8)
		D : DEC(12)
		F : FEB(2)
		J : JAN(1), JUN(6), JUL(7)
		M : MAR(3), MAY(5)
		N : NOV(11)
		O : OCT(10)
		S : SEP(9)
		*/
		if(letter1 == 'A'){
			if(letter2 == 'P'){
				monthNumber = 4;
			}
			else{
				monthNumber = 8;
			};
		}
		else if(letter1 == 'D'){
			monthNumber = 12; 
		}
		else if(letter1 == 'F'){
			monthNumber = 2;
		}
		else if(letter1 == 'J'){
			if(letter2 == 'A'){
				monthNumber = 1;
			}
			else if(letter3 == 'N'){
				monthNumber = 6;
			}
			else{
				monthNumber = 7;
			};
		}
		else if(letter1 == 'M'){
			if(letter3 == 'R'){
				monthNumber = 3;
			}
			else{
				monthNumber = 5;
			}
		}
		else if(letter1 == 'N'){
			monthNumber = 11;
		}
		else if(letter1 == 'O'){
			monthNumber = 10;
		}
		else{
			monthNumber = 9;
		}
		System.out.println("This is month number " + monthNumber);

	}
}