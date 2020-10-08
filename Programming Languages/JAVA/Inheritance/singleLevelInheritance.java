package Inheritance;


import java.util.*;
public class singleLevelInheritance 
{
	int a;
	protected int b;
	private int c;
	public String name;
	public String uid;
	public singleLevelInheritance() 
	{
		a=10;
		b=20;
		c=30;
		name="Shreyans";
		uid="18BCS3465";
		
	}
	public singleLevelInheritance(int a, int b) 
	{
		this(); 
		this.a = a;
		this.b = b;
	}
	public void display()
	{
		System.out.println("Value of c:"+c);
		System.out.println(name);
		System.out.println(uid);
	}
	private void privateFunction()
	{
		System.out.println("This function is not inherited");
	}
	protected void protectedFunction()
	{
		System.out.println("This is protected function");
	}
	void defaultFunction()
	{
		System.out.println("This is default function");
	}
}
