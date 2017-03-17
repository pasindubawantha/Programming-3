/*
Compiled on:
java version "1.8.0_121"
Java(TM) SE Runtime Environment (build 1.8.0_121-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.121-b13, mixed mode)

Qection :
4. Write and run a Java program that inputs an integer that represents a temperature on the
Celsius scale and then computes and prints its equivalent Fahrenheit value. Use the conversion
formula F = 1.8C +32.
*/
import java.util.Scanner;

class celToFen{
	public static void main(String args[]){
		Scanner keyboardScanner = new Scanner(System.in);
		System.out.print("Enter Integer Celsius value : ");
		int celsius = Integer.parseInt(keyboardScanner.nextLine());
		double fahrenheit = (1.8 * (double) celsius) + 32.0;
		System.out.println(fahrenheit + " Fahrenheit");
	}
}