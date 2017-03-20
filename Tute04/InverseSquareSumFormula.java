/*
Compiled on:
java version "1.8.0_121"
Java(TM) SE Runtime Environment (build 1.8.0_121-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.121-b13, mixed mode)

Qection :
4. Write and run a program that testes the summation formula

Generate a random integer n in the range of 0 to 9999, sum the numbers 1/𝑖
2
from 1 to n,
compute value of the expression on the right, and then print both values and their difference to
see how closely they agree.
*/
import java.util.Random;

class InverseSquareSumFormula{
	public static void main(String args[]){
		Random randomObject = new Random();
		int n = randomObject.nextInt(10000);
		System.out.println("n = " + n);
		double inverseSquareSum = 0;
		double pi = 3.14;
		for(int i = 1; i <= n; i++){
			inverseSquareSum += 1/(double)(i*i);
		}
		System.out.println("Sum = " + inverseSquareSum);
		double rightHandSide = pi*pi/6;
		System.out.println("(pi^2)/6 = " + rightHandSide);
		System.out.println("Difference = " + ((double)inverseSquareSum -rightHandSide));


	}
}