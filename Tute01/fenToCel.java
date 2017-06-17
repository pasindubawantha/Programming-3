/*
Compiled on:
java version "1.8.0_121"
Java(TM) SE Runtime Environment (build 1.8.0_121-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.121-b13, mixed mode)

Qection :
3. Write and run a Java program that inputs an integer that represents a temperature on the
Fahrenheit scale and then computes and prints its equivalent Celsius value. Use the conversion
formula C = 5(F – 32)/9
*/
import java.util.Scanner;

class fenToCel{
	public static void main(String args[]){
		Scanner keyboardScanner = new Scanner(System.in);
		System.out.print("Enter Integer Fahrenheit value : ");
		int fahrenheit = Integer.parseInt(keyboardScanner.nextLine());
		double celsius = 5.0 * (( ((double) fahrenheit) - 32.0) / 9.0);
		System.out.println(celsius + " Celsius");
	}
}