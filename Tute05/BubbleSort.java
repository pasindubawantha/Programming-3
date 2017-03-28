/*
Compiled on:
java version "1.8.0_121"
Java(TM) SE Runtime Environment (build 1.8.0_121-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.121-b13, mixed mode)

Qection :
3) Write a java program to sort the given number array using bubble sort algorithm.
*/
import java.util.Arrays;

class BubbleSort{
	public static void sort(int [] inArray){
		int tmp;
		for(int i = 0; i < inArray.length; i++ ){
			for(int j = 0 ; j < inArray.length -1 -i; j++){
				if(inArray[j] > inArray[j+1]){
					tmp = inArray[j];
					inArray[j] = inArray[j+1];
					inArray[j+1] = tmp;
				}
			}
		}

	}
	public static void main(String args[]){
		int [] inputArray = {8,3,4,5,7,9,0};
		System.out.println("Input array : " + Arrays.toString(inputArray));
		sort(inputArray);
		System.out.println("Output array : " + Arrays.toString(inputArray));

	}
}