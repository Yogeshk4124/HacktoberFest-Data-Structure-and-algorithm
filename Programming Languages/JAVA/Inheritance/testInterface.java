package Inheritance;

import java.util.*;

class testInterface implements inter
{
    public void output()
    {
        System.out.println("Hello coders "+n);
    }
    public static void main()
    {
        testInterface ob=new testInterface();
        ob.output();
        
        inter object;
        object=ob;
        object.output(); 
    }
}