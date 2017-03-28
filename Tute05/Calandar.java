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
			}
		}
		return false;

	}

	private static void printCalandar(int year, String month, String dayOne){
		String dashes = "----------------------------";
		System.out.println(dashes);
		System.out.println("        " + month + " " + year);
		System.out.println(dashes);
		System.out.println("SUN MON TUE WED THU FRI SAT");
		System.out.println(dashes);
		int noOfDays = getNoOfDays(year, month);
		int startingDate = getStartingDate(dayOne);
		for(int line = 1 ; line <= ((noOfDays + startingDate)/7) ; line++ ){
			if(line == 1){
				makeCalandarLine(startingDate, 1, noOfDays, dashes);
			}
			else{
				int startDate = (line * 7) - startingDate; 
				makeCalandarLine(0, startDate, noOfDays, dashes);
			} 
		}

	}

	private static int getStartingDate(String dayOne){
		int date = 0;
		dayOne = dayOne.toLowerCase().substring(0,3);
		switch(dayOne){
			case "mon":
				date = 1;
				break;
			case "tue":
				date = 2;
				break;
			case "wed":
				date = 3;
				break;
			case "thu":
				date = 4;
				break;
			case "fri":
				date = 5;
				break;
			case "sat":
				date = 6;
				break;
		}
		return date;
	}

	private static void makeCalandarLine(int noEmptyAtFirst, int startDate, int endDate, String dashes){
		String printString = "";
		int date = startDate;
		for(int i = 1 ; i < 8; i++){
			if(i <= noEmptyAtFirst){
				printString += "    ";
			}
			else if(date < 9){
				printString += " " + date + "  ";
				date++;
			}
			else if(date <= endDate){//end date is always > 9
				printString += " " + date + " ";
				date++;
			}
		}
		System.out.println(printString);
		System.out.println(dashes);
	}


	private static int getNoOfDays(int year, String month){
		month = month.toLowerCase().substring(0,3);
		int noOfDays = 0;
		switch(month){
			case "jan":
				noOfDays = 30;
				break;
			case "feb":
				if(isLeapYear(year)){
					noOfDays = 29;
				}
				else{
					noOfDays = 28;
				}
				break;
			case "mar":
				noOfDays = 31;
				break;
			case "apr":
				noOfDays = 30;
				break;
			case "may":
				noOfDays = 31;
				break;
			case "jun":
				noOfDays = 30;
				break;
			case "jul":
				noOfDays = 31;
				break;
			case "aug":
				noOfDays = 31;
				break;
			case "sep":
				noOfDays = 30;
				break;
			case "oct":
				noOfDays = 31;
				break;
			case "nov":
				noOfDays = 30;
				break;
			case "dec":
				noOfDays = 31;
				break;
		}
		return noOfDays;
	}

	public static void main(String args[]){
		Scanner keyboardScanner = new Scanner(System.in);
		System.out.print("Year : ");
		int year = keyboardScanner.nextInt(); 
		System.out.print("Month : ");
		String month = keyboardScanner.next();
		System.out.print("1st day of " + month + " : ");
		String dayOne = keyboardScanner.next();
		printCalandar(year, month, dayOne);
	}
}