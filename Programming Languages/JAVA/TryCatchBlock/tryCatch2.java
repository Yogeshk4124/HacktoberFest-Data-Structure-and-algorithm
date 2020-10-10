package TryCatchBlock;


import java.util.*;

class tryCatch2
{
    public static int divideByZero(int a,int b)
    {
        return a/b;
    }
    public static void main()
    {
        try
        {
            int a[]=new int[0];
            System.out.println(a[12]);
            System.out.println(tryCatch2.divideByZero(13,0));
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divide by zero error");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index out of bounds");
        }
    }
}