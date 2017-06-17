/*
Compiled on:
java version "1.8.0_121"
Java(TM) SE Runtime Environment (build 1.8.0_121-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.121-b13, mixed mode)

Qection :
3. The Y2K problem was that many thousands of old software systems around the world had been using
only two digits for the year in stored dates. It was feared that on January 1,2000, those dates were
,likely to be misinterpreted by the software as being January 1,1900, Thus causing unpredictable errors
and system crashes.
Write a Java program that inputs a date in the form mm/dd/yy and outputs in the expanded form
mm/dd/19yy . For example, the input 06/30/98 would be printed as 06/30/1998.
*/
import java.util.Scanner;

class Y2k{
	public static void main(String args[]){
		Scanner keyboardScanner = new Scanner(System.in);
		System.out.print("Input date with format mm/dd/yy : ");
		String date = keyboardScanner.nextLine();
		// For error checking
		int month = Integer.parseInt(date.substring(0,2));
		int day = Integer.parseInt(date.substring(3,5));
		if( 0 <= month && month <= 12 && 0 <= day && day <= 31){
			System.out.println(date.substring(0,6) + "19" + date.substring(6));
		}
		else{
			System.out.println("Invalid date format");
		}

		
	}
}