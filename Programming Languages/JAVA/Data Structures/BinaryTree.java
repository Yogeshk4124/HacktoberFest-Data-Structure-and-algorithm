import java.util.*;

class BinaryTree{
	class Node{
		int data;
		Node left;
		Node right;
		public Node(int d){
			data=d;
			left=right=null;
		}
	}
	Node root;
	public Node getRoot(){
		return root;
	}
	void preorderDisplay(Node n){
		if(n==null)
			return;
		System.out.print(n.data+"\t");
		preorderDisplay(n.left);
		preorderDisplay(n.right);
	}
	void inorderDisplay(Node n){
		if(n==null)
			return;
		inorderDisplay(n.left);
		System.out.print(n.data+"\t");
		inorderDisplay(n.right);
	}
	void postorderDisplay(Node n){
		if(n==null)
			return;
		postorderDisplay(n.left);
		postorderDisplay(n.right);
		System.out.print(n.data+"\t");
	}
	void insertNode(int d){
		root=insert(root,d);
	}
	Node insert(Node root,int data){
		if(root==null)
			return new Node(data);

		if(data<root.data)
			root.left=insert(root.left,data);
		else if(data>root.data)
			root.right=insert(root.right,data);
		else
			return root;

		return root;
	}
	boolean search(int s){
		Node n=root;
		while(n!=null){
			if(n.data==s)
				return true;
			else if(n.data<s)
				n=n.right;
			else if(n.data>s)
				n=n.left;
		}
		return false;
	}
	int smallestValue(Node n){
		return n.left==null?n.data:smallestValue(n.left);
	}
	Node delete(Node n,int value){
		if(n==null)
			return null;
		if(value==n.data){
			if(n.left==null && n.right==null)
				return null;
			else if(n.right==null)
				return n.left;
			else if(n.left==null)
				return n.right;
			else{
				int min=smallestValue(n.right);
				n.data=min;
				n.right=delete(n.right,min);
				return n;
			}
		}
		if(value<n.data){
			n.left=delete(n.left,value);
			return n;
		}
		n.right=delete(n.right,value);
			return n;
	}
	void deleteNode(int value){
		root=delete(root,value);
	}
	public void dfsInTree(Node n){
		Stack<Node> s=new Stack<Node>();
		s.add(root);
		while(s.isEmpty()==false){
			Node x=s.pop();
			if(x.right!=null) s.add(x.right);
			if(x.left!=null)  s.add(x.left);
			System.out.print(x.data+"\t");
		}
	}
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		BinaryTree bt=new BinaryTree();

		System.out.println("Enter the number of nodes to enter");
		int n=in.nextInt();

		System.out.println("Enter the Nodes");
		for(int i=0;i<n;i++)
			bt.insertNode(in.nextInt());

		System.out.println("\n Pre-order display:\t"); bt.preorderDisplay(bt.getRoot());
		System.out.println("\n In-order display:\t");  bt.inorderDisplay(bt.getRoot());
		System.out.println("\n Post-order display:\t");bt.postorderDisplay(bt.getRoot());
		System.out.println("\n Dfs-order display:");bt.dfsInTree(bt.getRoot());
		System.out.println("\n Enter the number to be searched");
		System.out.println(bt.search(in.nextInt())?" Element found ":" Element not found ");
		System.out.println(" Enter the number to be deleted");
		bt.deleteNode(in.nextInt());
		System.out.println("Dfs-order display:\t");  bt.dfsInTree(bt.getRoot());
	
		
	}
}