class Stack{
	private char a[];
	private int tos;

	public Stack(int size){
		a = new char[size];
		tos = -1;
	}

	public void push(char c){
		tos++;
		a[tos] = c;
	}
	public char pop(){
		char c = a[tos];
		tos--;
		return c;
	}
	public boolean isEmpty(){
		if(tos == -1)
			return true;
		else
			return false;
	}

}

public class BalancedParanthesis{
	public static void main(String args[]){
		String checkString = args[0];
		Stack fingstack = new Stack(checkString.length());
		char openBracket = '[';
		char closeBracket = ']';
		char openBracket01 = '(';
		char openBracket02 = '{';
		char closeBracket01 = ')';
		char closeBracket02 = '}';
		boolean balanced = true;
		for(int i = 0; i < checkString.length(); i++){
			if(checkString.charAt(i) == openBracket || checkString.charAt(i) == openBracket01 || checkString.charAt(i) == openBracket02)
				fingstack.push(checkString.charAt(i));
			else if(checkString.charAt(i) == closeBracket || checkString.charAt(i) == closeBracket01 || checkString.charAt(i) == closeBracket02){
				if(fingstack.isEmpty()){
					balanced = false;
					break;
				}
				else{
					char currentOpenBraket = fingstack.pop();
					char currentCloseBraket = checkString.charAt(i);
					switch(currentOpenBraket){
						case '[' :
							if(closeBracket != currentCloseBraket)
								balanced = false;
							break;
						case '(' :
							if(closeBracket01 != currentCloseBraket)
								balanced = false;
							break;
						case '{' :
							if(closeBracket02 != currentCloseBraket)
								balanced = false;
							break;
					}
				}
			}
		}
		if(balanced && fingstack.isEmpty())
			System.out.println("balanced !");
		else
			System.out.println("Not balanced !");
	}
}
