package TryCatchBlock;

import java.util.*;


class tryCatch4
{
    public static void main()
    {
        try
        {
            System.out.println(13/0);
            int a[]=new int[0];
            System.out.println(a[12]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divide by zero error");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index out of bounds");
        }
        finally
        {
            System.out.println("Executes if exception is caught or not");
        }
    }
}