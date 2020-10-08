package Inheritance;  

import java.util.*;

class AA
{
    int x;
    private int xyz=13;
    protected int abc=17;
    public AA()
    {
        System.out.println("Constructor of class AA");
        x=13;
    }
    public AA(int b)
    {
        x=b;
    }
    public void display()
    {
        System.out.println("I am A");
    }
    
}