import java.util.*;

class StackArray{
	static final int max=100;
	int stack[]=new int[max];
	int top;
	public StackArray(){
		top=-1;
	}
	void push(int element){
		if(top>(max-1)){
			System.out.println("Stack Overflow");
		}
		else{
			stack[++top]=element;
			System.out.println(element+" inserted in the stack");
		}
	}
	void pop(){
		if(top<0){
			System.out.println("Stack Underflow");
		}
		else{
			System.out.println(stack[top--]+" deleted from stack");
		}
	}
	void peek(){
		if(top<0){
			System.out.println("Stack Underflow");
		}
		else{
			System.out.println(stack[top]);
		}
	}
	void display(){
		System.out.println("Display Stack");
		for (int i=top;i>=0;i-- ) {
			System.out.println(stack[i]+"\t");
		}
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Fuck Stack");
		StackArray s=new StackArray();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.pop();
		s.peek();
		s.display();
	}

}