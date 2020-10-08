package TryCatchBlock;

import java.util.*;


class tryCatch1
{
    public static int divideByZero(int a,int b)
    {
        return a/b; //Normal division of a and b
    }
    public static void main(String args[])
    {
        try
        {
            System.out.println(tryCatch1.divideByZero(13,7));//a is 13 and b is 7 division is possible
            System.out.println(tryCatch1.divideByZero(13,0));//a is 13 and b is 0 division not possible error occurs 
        }
        catch(ArithmeticException e)//catches the exception when any errors occurs
        {
            System.out.println("Divide by zero error");//this line runs when error occurs 
        }
        
    }
}