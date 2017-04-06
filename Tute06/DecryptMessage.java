/*
Compiled on:
java version "1.8.0_121"
Java(TM) SE Runtime Environment (build 1.8.0_121-b13)
Java HotSpot(TM) 64-Bit Server VM (build 25.121-b13, mixed mode)

Qection :
3.) Your team has interpreted five strange message words from radio
communication which were encrypted.
YIFHHVOH
ZNHGVIWZN
UIZMPUFIG
SVZGSILD
AFIRXS
After decrypting, the cryptographist found that, the letter E is actually letter
V, Z is actually A and A is actually Z. Also they found out that all the other
letters fit accordingly into the English alphabet. What they have done was,
they reverse the alphabet and use for the secret communication.
In the meantime your team has intercepted many more messages with the
same letter replacement format. Since hand conversion of large number of
messages is a difficult task, you are assigned to come up with a solution to
this problem using programming.
Write a Java program to display the correct words in the command line when
you give encrypted words as a command line argument. You have to
correctly identify the above mentioned five secret words. 
*/
class DecryptMessage{
	public static char decryptChar(char chrachter){
		int decryptedIntValue = ((int) chrachter - (int)'a' + 1) - 26;
		if(decryptedIntValue < 0)
			decryptedIntValue = 0 - decryptedIntValue;
		char decryptedCharachter = (char)(decryptedIntValue + (int) 'a');
		return decryptedCharachter;
	}
	public static void main(String args[]){
		if(args.length != 0 ){
			String message = args[0];
			message = message.toLowerCase();
			String decryptedMessage = "";
			for(int i = 0; i < message.length(); i++){
				decryptedMessage += decryptChar(message.charAt(i));
			}
			System.out.println("Decrypted message : ");
			System.out.println(decryptedMessage);
		}
		else{
			System.out.println("Please enter argument as : ");
			System.out.println("java DecryptMessage [encrypted message]");
		}
	}
}