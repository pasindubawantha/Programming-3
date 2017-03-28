/*
Compiled on:
java version "1.8.0_121"
Java(TM) SE Runtime Environment (build 1.8.0_121-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.121-b13, mixed mode)

Qection :
4) When you enter following inputs you should print the calendar of that particular month using
java.
INPUT:
Year: 2016
Month: February
1st day of February: Monday
*/
import java.util.Scanner;

class Calandar {
	private static boolean isLeapYear(int year){
		if(year > 1584){
			if(year % 400 == 0){
				return true;
			}
			else if((year % 4 == 0) && (year % 100 != 0)){
				return true;
			}else{
				return false;
			};
		}
		else{
			return false;
		};

	}

	private static void printCalandar(int year, String month, String dayOne){
		String dashes "--------------------";
		System.out.println(dashes);
		System.out.println("        " + month + " " + year);
		System.out.println(dashes);
		System.out.println("SUN MON TUE WED THU FRI SAT")
		System.out.println(dashes)
	}

	private static getNoOfDays(int year, String month){
		switch(month){
			"January"
		}
	}

	public static void main(String args[]){
		Scanner keyboardScanner = new Scanner(System.in);
		System.out.print("Year : ");
		int year = keyboardScanner.nextInt(); 
		System.out.print("Month : ");
		String month = keyboardScanner.nextLine();
		System.out.print("1st day of " + month + " : ");
		String dayOne = keyboardScanner.nextLine();
	}
}