/*
Compiled on:
java version "1.8.0_121"
Java(TM) SE Runtime Environment (build 1.8.0_121-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.121-b13, mixed mode)

Qection :
Write and run a Java program that initializes an integer variable n with the value 5814 and then
uses the quotient and remainder operators to extract and print each digit of n. The output
should look like this:
n = 5814
The digits of n are 5, 8, 1 and 4
Hint: use n/ 1000 to extract the thousands digit from n, and the use n %= 1000 to remove the
thousands digit from n.
*/

class digits{
	public static void main(String args[]){
		int n = 5814;
		int divisor = 10;
		int currentDigit;
		boolean putAnd = true;
		String outputString = "";
		System.out.println("n = " + n);
		do{
			currentDigit = n%divisor;
			n = n - currentDigit;
			n /= divisor;
			if(putAnd){
				outputString =  " and " + currentDigit;
				putAnd = false;
			}
			else{
				outputString = currentDigit + outputString;
				if(n > 0){
					outputString =  " ," + outputString;
				}
			}
			
		}
		while(n > 0);
		System.out.println("The digits of n are " + outputString);
	}
}