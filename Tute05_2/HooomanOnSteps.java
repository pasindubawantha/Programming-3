/*
Compiled on:
java version "1.8.0_121"
Java(TM) SE Runtime Environment (build 1.8.0_121-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.121-b13, mixed mode)

Qection :
4. Write a new program(new class file) to place above human structure on the staircase
with size 5 when you are given the step number.
*/
import java.util.Scanner;
class HooomanOnSteps{
	public static void buildStair(int step){
		String stepSpace = "";
		for(int j = 1; j < step; j++){
			stepSpace += "          ";
		}
		for(int i = 0; i < 5 ; i++){
			if(i == 4)
				System.out.println(stepSpace + "*  *  *  *");
			else
				System.out.println(stepSpace + "         *");

		}
	}
	public static void buildHooomanOnStair(int step){
		String stepSpace = "";
		for(int j = 1; j < step; j++){
			stepSpace += "          ";
		}
		System.out.println(stepSpace + "    0    *");
		System.out.println(stepSpace + "   /|\\   *");
		System.out.println(stepSpace + "    |    *");
		System.out.println(stepSpace + "   / \\   *");
		System.out.println(stepSpace + "*  *  *  *");
	}
	public static void main(String args[]){
		Scanner keyBoardScanner = new Scanner(System.in);
		int humanOnStep = 5;
		System.out.print("Placing human on step : ");
		humanOnStep -= keyBoardScanner.nextInt();
		if(humanOnStep < 5 && humanOnStep >=0){
			for(int i = 0; i < 5; i++){
				if(i == humanOnStep)
					buildHooomanOnStair(5 - i);
				else
					buildStair(5 - i);
			}
		}
		else{
			System.out.println("Invalid step number");
		}

	}

}