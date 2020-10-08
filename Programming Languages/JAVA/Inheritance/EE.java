package Inheritance;

import java.util.*;

class EE extends AA
{
    int x=100;
    public EE()
    {
        super(256);
        System.out.println("Constructor of class EE");
    }
    public void display()
    {
        System.out.println("I am EE");
        System.out.println("X="+x);
        System.out.println("super.X="+super.x);
        super.display();
    }
    public static void main()
    {
        System.out.println("EE ob=new EE();\nob.display();");
         
        EE ob=new EE();
        ob.display();
        System.out.println();
        
        System.out.println("A obj=new A();\nobj.display();");
        AA obj=new AA();
        obj.display();
        System.out.println();
       
        System.out.println("A object=new EE();\nobject.display();");
        AA object=new EE();
        object.display();
        
    }
}