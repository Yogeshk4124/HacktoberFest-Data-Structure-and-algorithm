import java.util.*;

class StackPostfixToInfix{
	static Node top;
	static class Node{
		String data;
		Node next;
		public Node(String d){
			data=d;
		}
	}
	static public boolean ifEmpty(){
		if(top==null)
			return true;
		return false; 
	}
	static void push(String element){
		Node newNode=new Node(element);
		if(newNode==null){
			return;
		}
		newNode.next=top;
		top=newNode;
	}
	static String pop(){
		if(top==null){
			return "-1";
		}
		else{
			String t=top.data;
			top=top.next;
			return t;
		}
	}
	static String peek(){
		if(!ifEmpty())
			return top.data;
		else return "0"; 	
	}
	static boolean isOperand(char ch){
		return (ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z');
	}
	static String convert(String s){
		StackPostfixToInfix stack=new StackPostfixToInfix();

		for(int i=0;i<s.length();i++){

			if(isOperand(s.charAt(i)))
				stack.push(s.charAt(i)+"");
			else{
				String a=stack.peek();
				stack.pop();
				String b=stack.peek();
				stack.pop();
				String fuck="("+b+s.charAt(i)+a+")";
				stack.push(fuck);
			}
		}
		return stack.peek();
	}
	public static void main(String[] args) {
		String e="ab*c+";
		System.out.println(convert(e));	
	}
}