/*
Compiled on:
java version "1.8.0_121"
Java(TM) SE Runtime Environment (build 1.8.0_121-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.121-b13, mixed mode)

Qection :
1. Build a staircase with 5 steps using above structure.
*/

class Steps5{
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
	public static void buildStairCase(int size){
		for(int i = 0; i < size; i++){
			buildStair(size - i);
		}
	} 
	public static void main(String args[]){
		buildStairCase(5);
	}
}