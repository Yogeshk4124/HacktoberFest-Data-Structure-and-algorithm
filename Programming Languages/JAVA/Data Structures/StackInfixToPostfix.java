import java.util.*;

class StackInfixToPostfix{
	static Node top;
	static class Node{
		int data;
		Node next;
		public Node(int d){
			data=d;
		}
	}
	static public boolean ifEmpty(){
		if(top==null)
			return true;
		return false; 
	}
	static void push(int element){
		Node newNode=new Node(element);
		if(newNode==null){
			return;
		}
		newNode.next=top;
		top=newNode;
	}
	static int pop(){
		if(top==null){
			return -1;
		}
		else{
			int t=top.data;
			top=top.next;
			return t;
		}
	}
	static char peek(){
		if(!ifEmpty())
			return (char)top.data;
		else return '0'; 	
	}
	static int precedence(char ch){
		switch (ch) {
			case '+' :
			case '-' :
				return 1;
			case '*' :
			case '/' :
				return 2;
			case '^' :
				return 3;
		}
		return -1;
	}
	static String convert(String s){
		String res="";
		StackInfixToPostfix stack=new StackInfixToPostfix();

		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);

			if(Character.isLetterOrDigit(ch))
				res=res+ch;
			else if(ch=='(')
				stack.push(ch);
			else if(ch==')'){
				while(!stack.ifEmpty()&&stack.peek()!='('){
					res=res+(char)stack.pop();
				}
				if(!stack.ifEmpty()&&stack.peek()!='(')
					return "Invalid Expression Found";
				else
					stack.pop();
			}
			else{
				while(!stack.ifEmpty()&& precedence(ch)<=precedence(stack.peek())){
					if(stack.peek()=='(') 
						return "Invalid Expression Found";
					res=res+(char)stack.pop();
				}
				stack.push(ch);
			}
		}
		while(!stack.ifEmpty()){
			if(stack.peek()=='(')
				return "Invalid Expression Found";
			res=res+(char)stack.pop();
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);

		System.out.println("Enter the Expression");
		String exp=in.nextLine();
		System.out.println(convert(exp));	
	}
}