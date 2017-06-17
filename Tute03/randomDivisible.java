/*
Compiled on:
java version "1.8.0_121"
Java(TM) SE Runtime Environment (build 1.8.0_121-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.121-b13, mixed mode)

Qection :
3) Write and run a Java program that generates a random integer and reports whether it is divisible by
2, by 3 or by 5.
Hint: n is divisible by d if the remainder from dividing n by d is 0.
*/
import java.util.Random;

class randomDivisible{
	public static void main(String args[]){
		Random randomObject = new Random();
		int randomNumber = randomObject.nextInt();
		boolean notDivisibleBy2or3or5 = true;
		System.out.println("Random number : " + randomNumber); 
		if(randomNumber % 2 == 0){
			System.out.println("Divisible by 2");
			notDivisibleBy2or3or5 = false;
		}
		if(randomNumber % 3 == 0){
			System.out.println("Divisible by 3");
			notDivisibleBy2or3or5 = false;
		}
		if(randomNumber % 5 == 0){
			System.out.println("Divisible by 5");
			notDivisibleBy2or3or5 = false;
		}
		if(notDivisibleBy2or3or5){
			System.out.println("Not divisible by 2,3 or 5");
		}
	}
}