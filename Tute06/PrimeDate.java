/*
Compiled on:
java version "1.8.0_121"
Java(TM) SE Runtime Environment (build 1.8.0_121-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.121-b13, mixed mode)

Qection :
1. ) You are a programmer who is working in an Intelligence Agency which is
situated in Europe. You have assigned to a team which is tracking the illegal
works carried out by a fresh terrorist organization in the Central Europe. Spy
agents of your team have found that their Modus operandi (MO) - Mode of
Operation - is doing crimes on dates of a particular month where the date is
a prime number. You have assigned to write a program to find out whether
there will be a crime for a given date. The maximum number you may have
is 31.
*/
import java.util.Scanner;
class PrimeDate{
	// Since our input range is from 1 to 31. We give the simplest solution
	public static boolean isPrime(int number){
		for(int i = 2; i < (int) Math.sqrt(number) + 1 ; i++){
			if(number % i == 0){
				return	false;		
			}
		}
		return true;
	}
	public static void main(String args[]){
		Scanner keyBoardScanner = new Scanner(System.in);
		System.out.print("Enter date of the month as a Integer : ");
		int day = keyBoardScanner.nextInt();
		if(day >= 1 && day <= 31){
			if(isPrime(day))
				System.out.println("There will be a crime today !");
			else
				System.out.println("No crimes today");
		}
		else
			System.out.println("Invalid Date"); 
	}

}