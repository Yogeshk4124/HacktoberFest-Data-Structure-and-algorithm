import java.util.*;

class PrefixEvaluationStack{
	Node top;
	class Node{
		int data;
		Node next;
		public Node(int d){
			data=d;
		}
	}
	public boolean ifEmpty(){
		if(top==null)
			return true;
		return false; 
	}
	void push(int element){
		Node newNode=new Node(element);
		if(newNode==null){
			return;
		}
		newNode.next=top;
		top=newNode;
	}
	int pop(){
		if(top==null){
			//return -1;
		}
		else{
			int i=top.data;
			top=top.next;
			return i;
		}
		return -1;
	}
	int peek(){
		if(!ifEmpty())
			return top.data;
		else return -1;
	}
	void calculate(String s){
		PrefixEvaluationStack stack=new PrefixEvaluationStack();

		for(int i=s.length()-1;i>=0;i--){
			char ch=s.charAt(i);
			if(Character.isDigit(ch))
				stack.push(ch-'0');
			else{
				int b=stack.pop();
				int a=stack.pop();

				switch(ch){
					case '+' :{
						stack.push(a+b);
						break;
					}
					case '-' :{
						stack.push(a-b);
						break;
					}
					case '*' :{
						stack.push(a*b);
						break;
					}
					case '/' :{
						stack.push(a/b);
						break;
					}
					case '^' :{
						stack.push(a^b);
						break;
					}
				}
			}
		}
		System.out.println("Final Answer is\t"+stack.pop());
	}
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		PrefixEvaluationStack s=new PrefixEvaluationStack();
		System.out.println("Enter a Prefix Expression:");
		s.calculate(in.nextLine());
	}
}