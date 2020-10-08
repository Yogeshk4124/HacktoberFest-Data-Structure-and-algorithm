import java.util.*;

class StackLinkedList{
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
			System.out.println("Stack overflow");
			return;
		}
		newNode.next=top;
		top=newNode;
		System.out.println(element+" inserted into Stack Linked List");

	}
	void pop(){
		if(top==null){
			System.out.println("Stack underflow");
		}
		else{
			System.out.println(top.data+" deleted from Stack Linked List");
			top=top.next;
		}
	}
	void peek(){
		if(!ifEmpty())
			System.out.println("peek "+top.data);
		else System.out.println("Stack Linked List Underflow");
	}
	void display(){
		if(!ifEmpty())
			System.out.println("Stack Linked List Underflow");
		else{
			System.out.println("Stack Linked List:\t");
			Node n=top;
			while(n!=null){
				System.out.print(n.data+"\t");
				n=n.next;
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		StackLinkedList list=new StackLinkedList();
		boolean runner=true;
		while(runner){
			System.out.println("1-Push Element\n2-Pop Element\n3-Peek Element\n4-Display Stack Linked List\n5-Exit");
			int ch=in.nextInt();
			switch(ch){
				case 1 : {
					System.out.println("Enter the element");
					list.push(in.nextInt());
					break;
				}
				case 2 : {
					list.pop();
					break;
				}
				case 3 : {list.peek();
					break;
				}
				case 4 : {
					list.display();
					break;
				}
				case 5 : {
					runner=false;
					break;
				}
				default: {
					System.out.println("Wrong Choice. Re Enter");
					break;
				}
			}
		}
	}
}