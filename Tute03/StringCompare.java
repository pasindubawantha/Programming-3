/*
Compiled on:
java version "1.8.0_121"
Java(TM) SE Runtime Environment (build 1.8.0_121-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.121-b13, mixed mode)

Qection :
4) Write and run a Java program that inputs three names and then prints them in their increasing
alphabetical order. Use the String class method compareTo().
For example, if s1 is the string ABACADABRA and s2 is the sting ABLE, the s1.compareTo(s2) will
be a negative integer, s2.compareTo(s2) will be a 0, and s2.compareTo(s1) will be a positive
integer.
So the condition (s1.compareTo(s2) <= 0) can be used to determine whether s1 precedes s2
lexicographically (i.e., according to the dictionary ordering).
*/
import java.util.Scanner;

class SringCompare{
	public static void main(String args[]){
		Scanner keyboardScanner = new Scanner(System.in);
		System.out.print("Name 1 : ");
		String name1 = keyboardScanner.nextLine();
		System.out.print("Name 2 : ");
		String name2 = keyboardScanner.nextLine();
		System.out.print("Name 3 : ");
		String name3 = keyboardScanner.nextLine();
		if(name1.compareTo(name2) <= 0){//name1 < name2
			if(name1.compareTo(name3) <= 0){//name1 < name2, name1 < name3
				System.out.println(name1);
				if(name2.compareTo(name3) <= 0){// name1 < name2 < name3
					System.out.println(name2);
					System.out.println(name3);
				}
				else{// name1 < name3 < name2
					System.out.println(name3);
					System.out.println(name2);
				};
			}
			else{//name3 < name1 < name2
				System.out.println(name3);
				System.out.println(name1);
				System.out.println(name2);
				};
			}
		else{//name2 < name1
			if(name2.compareTo(name3) <= 0){//name2 <name1 , name2 < name3
				System.out.println(name2);
				if(name1.compareTo(name3) <= 0){// name2 < name1 < name3
					System.out.println(name1);
					System.out.println(name3);
				}
				else{// name2 < name3 < name1
					System.out.println(name3);
					System.out.println(name1);
				};
			}
			else{//name3 < name2 < name1
				System.out.println(name3);
				System.out.println(name2);
				System.out.println(name1);
			};
		};
	}
}