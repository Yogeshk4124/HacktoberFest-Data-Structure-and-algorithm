import java.util.*;

class QueueArray{
	int front;
	int rear;
	int queue[];
	int size;
	int capacity;
	public  QueueArray(int size){
		capacity=size;
		size=0;
		front=0;
		rear=-1;
		queue=new int[capacity];
	}
	public boolean ifEmpty(){
		return (rear==-1);
	}
	public boolean ifFull(){
		return(size==capacity);
	}
	public void enqueue(int item){
		if(ifFull()){
			System.out.println("Stack Overflow");
		}
		else{
			queue[++rear]=item;
		}
		size++;
	}
	public void dequeue(){
		int i=0;;
		if(ifEmpty()){
			System.out.println("Stack Underflow");
		}
		else{
			i=front;
			front++;
			System.out.println(queue[i]+" removed from Queue");
		}
	}
	public void getFront(){
		if(ifEmpty()||front>rear){
			System.out.println("Stack Underflow");
		}
		else{
			System.out.println(queue[front]+" is in front");
		}
	}
	public void getRear(){
		if(ifEmpty()||front>rear){
			System.out.println("Stack Underflow");
		}
		else{
			System.out.println(queue[rear]+" is in rear");
		}
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);

		System.out.println("Enter the capacity of Queue");
		QueueArray q=new QueueArray(in.nextInt());

		boolean check=true;
		while(check){
			System.out.println("1. Insert Element\n2. Delete Element\n3. Front Element\n4. Rear Element\n5. Exit\n");
			int ch=in.nextInt();
			switch(ch){
				case 1 : {
					System.out.println("Enter the Element to be inserted");
					q.enqueue(in.nextInt());
					break;
				}
				case 2 : {
					q.dequeue();
					break;
				}
				case 3 : {
					q.getFront();
					break;
				}
				case 4 : {
					q.getRear();
					break;
				}
				case 5 : {
					check=false;
					break;
				}
				default : System.out.println("Wrong choice");
			}
		}
	}
}