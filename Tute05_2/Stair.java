/*
Compiled on:
java version "1.8.0_121"
Java(TM) SE Runtime Environment (build 1.8.0_121-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.121-b13, mixed mode)

Qection :
1. Write a function to print following structure on the CLI using loops in java.
         *
         *
         *
         *
*  *  *  *
*/
class Stair{
	public static void buildStair(){
		for(int i = 0; i < 5 ; i++){
			if(i == 4)
				System.out.println("*  *  *  *");
			else
				System.out.println("         *");

		}
	}
	public static void main(String args[]){
		buildStair();
	}
}