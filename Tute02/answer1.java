/*
Compiled on:
java version "1.8.0_121"
Java(TM) SE Runtime Environment (build 1.8.0_121-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.121-b13, mixed mode)

Qection :
1. Write and run a Java program that does the following:
I. Declare a String object named s containing the string “Call me Tharaka”.
II. Print the entire string.
III. Use the length () method to print the length of the string.
IV. Use the CharAt () method to print the first character in the string.
V. Use the CharAt () and the length () methods to print the last character in the string.
VI. Use the indexOf () and the substring () methods to print the first word in the string.
*/
class answer1{
	public static void main(String args[]){
		String s = "Call me Tharaka";//answer I
		System.out.println(s);//answer II
		System.out.println(s.length());//answer III
		System.out.println(s.charAt(0));//answer IV
		System.out.println(s.charAt(s.length()-1));//answer V 
		System.out.println(s.substring(s.indexOf("C"),s.indexOf(" ")));//answer VI
	}
}