/*
Compiled on:
java version "1.8.0_121"
Java(TM) SE Runtime Environment (build 1.8.0_121-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.121-b13, mixed mode)

Qection :
1) Write and run a Java program that generates a random integer, tests whether it is positive, and
reports that it is if it is.
*/
import java.util.Random;

class random{
	public static void main(String args[]){
		Random randomObject = new Random();
		int randomNumber = randomObject.nextInt();
		System.out.println("Random Integer : " + randomNumber);
		if(randomNumber >= 0){
			System.out.println("Random number is positive");
		}
		else{
			System.out.println("Random number is negative");
		}
	}
}