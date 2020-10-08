package Inheritance;

import java.util.*;
public class test extends singleLevelInheritance
{
	int c;
	public test() 
	{	
	}
	public test(int a,int b,int c) 
	{
		super(a,b);
		this.c = c;
	}
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter value of a:");
		int a=in.nextInt();
		System.out.println("enter value of b:");
		int b=in.nextInt();
		
		test ob=new test(a,b,100);
		System.out.println("a="+ob.a);
		System.out.println("b="+ob.b);
		System.out.println("c="+ob.c);
		ob.protectedFunction();
		//ob.privateFunction();//not inherited
		ob.defaultFunction();
		ob.display();
	}
}