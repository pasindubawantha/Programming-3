/*
Compiled on:
java version "1.8.0_121"
Java(TM) SE Runtime Environment (build 1.8.0_121-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.121-b13, mixed mode)

Qection :
2) Write and run a Java program that generates two random integer, determines their minimum and
prints it.
*/
import java.util.Random;

class randomMinimum{
	public static void main(String args[]){
		Random randomObject = new Random();
		int randomNumber1 = randomObject.nextInt();
		int randomNumber2 = randomObject.nextInt();
		System.out.println("Random number 1 : " + randomNumber1);
		System.out.println("Random number 2 : " + randomNumber2);
		if(randomNumber1 < randomNumber2){
			System.out.println("Minimum random number : " + randomNumber1);
		}
		else{
			System.out.println("Minimum random number : " + randomNumber2);
		}
	}
}