/*
Compiled on:
java version "1.8.0_121"
Java(TM) SE Runtime Environment (build 1.8.0_121-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.121-b13, mixed mode)

Qection :
5) Write and run a Java program that generates a random year between 1800 and 2000 and then
reports whether it is a leap year. A leap year is an integer greater than 1584 that is either divisible by
400 or is divisible by 4 but not 100. To generate an integer in the range 1800 to 2000, use,
int year = Math.round =( 200*x +1800);
Where x is a random float. The round() method of the Math class returns the integer nearest the
float passed to it. The transformation y = 200x+ 1800 converts a number in the range
0<= x < 1 into a number in the range 1800 <= y< 2000.
*/
import java.util.Random;

class RandomYear{
	public static void main(String args[]){
		Random randomObject = new Random();
		int year = Math.round(200*randomObject.nextFloat() + 1800);
		System.out.print("Year " + year + " ");
		if(year > 1584){
			if(year % 400 == 0){
				System.out.print("is a leap year \n");
			}
			else if((year % 4 == 0) && (year % 100 != 0)){
				System.out.print("is a leap year \n");
			}else{
				System.out.print("is not a leap year \n");
			};
		}
		else{
			System.out.print("is not a leap year \n");
		};

	}
}