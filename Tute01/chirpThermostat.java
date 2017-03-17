/*
Compiled on:
java version "1.8.0_121"
Java(TM) SE Runtime Environment (build 1.8.0_121-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.121-b13, mixed mode)

Qection :
5. It has been observed that crickets tend to chirp in the summer at a rate that is related to the
temperature by the formula T =40 +c/4, Where c is the number of chirps per minute and T is the
temperature in Fahrenheit degrees. Write and run a Java program that inputs the number of
chirps per minute and outputs the temperature in decimal form.
*/
import java.util.Scanner;

class chirpThermostat{
	public static void main(String args[]){
		Scanner keyboardScanner = new Scanner(System.in);
		System.out.print("Enter number of chirps per minute made by crickets (Integer value of course) : ");
		int chirps = Integer.parseInt(keyboardScanner.nextLine());
		double fahrenheit = 40.0 + ((double) chirps / 4.0);
		System.out.println("Temperature : " + fahrenheit + " Fahrenheit");
	}
}
