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

class MonthProcessing2 {
	public static void main(String args[]){
		Scanner keyboardScanner = new Scanner(System.in);
		System.out.print("Enter the month : ");
		String month = keyboardScanner.nextLine();
		System.out.println("You entered " + month);
		String first3Letters = month.substring(0,3);
		first3Letters = first3Letters.toUpperCase();
		System.out.println("Its abbreviation is " + first3Letters);
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
		if(first3Letters.equals("JAN")) monthNumber = 1;
		if(first3Letters.equals("FEB")) monthNumber = 2;
		if(first3Letters.equals("MAR")) monthNumber = 3;
		if(first3Letters.equals("APR")) monthNumber = 4;
		if(first3Letters.equals("MAY")) monthNumber = 5;
		if(first3Letters.equals("JUN")) monthNumber = 6;
		if(first3Letters.equals("JUL")) monthNumber = 7;
		if(first3Letters.equals("AUG")) monthNumber = 8;
		if(first3Letters.equals("SEP")) monthNumber = 9;
		if(first3Letters.equals("OCT")) monthNumber = 10;
		if(first3Letters.equals("NOV")) monthNumber = 11;
		if(first3Letters.equals("DEC ")) monthNumber = 12;


		System.out.println("This is month number " + monthNumber);

	}
}