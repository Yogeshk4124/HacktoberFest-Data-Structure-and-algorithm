package Inheritance;

import java.util.*;
class AbstractStatic extends staticAbstract
{
    
    public void display()
    {
        System.out.println("c="+c);
    }
    public static void main()
    {
        AbstractStatic ob[]=new AbstractStatic[3]; 
        ob[0]=new AbstractStatic();
        ob[1]=new AbstractStatic();
        ob[2]=new AbstractStatic();
        ob[0].display();
        ob[1].display();
        ob[2].display();
    }
}