/*
Compiled on:
java version "1.8.0_121"
Java(TM) SE Runtime Environment (build 1.8.0_121-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.121-b13, mixed mode)

Qection :
2. Write and run a program that testes the summation formula

Generate a random integer n in the range of 0 to 99, sum the integers from 1 to n, compute the
value of the expression on the right, and then print both values to see that they agree.
*/
import java.util.Random;

class SqaureSumFormula{
	public static void main(String args[]){
		Random randomObject = new Random();
		int n = randomObject.nextInt(100);
		System.out.println("n = " + n);
		int squreSum = 0;
		for(int i = 0; i <= n; i++){
			squreSum += i*i;
		}
		System.out.println("Squre sum = " + squreSum);
		int rightHandSide = n*(n+1)*(2*n+1)/6;
		System.out.println("n(n+1)(2n+1)/6 = " + rightHandSide);


	}
}