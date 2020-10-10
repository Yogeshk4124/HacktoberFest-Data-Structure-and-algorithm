package TryCatchBlock;


import java.util.*;

class tryCatch6
{
    public static int divideByZero(int a,int b)
    {
        return a/b;
    }
    public static void tryInsideTryBlock()
    {
        try
        {
            System.out.println(tryCatch6.divideByZero(13,0));
        }
        catch(ArithmeticException e)
        {
            System.out.println("Inside Exception 'Divide by zero error'");
        }
    }
    public static void main()
    {
        try
        {
            tryCatch6.tryInsideTryBlock();
            tryCatch6.divideByZero(17,0);
        }
        catch(Exception e)
        {
            System.out.println("Outside Exception '"+e.getMessage()+"'");
        }
    }
}