package InputTypes;

import java.util.*;

class Scanner_Input
{
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        
        System.out.println("Enter a number");
        int n=in.nextInt();
        System.out.println("You entered:"+n);
        System.out.printf("%d \n",n);
        double a=13.0120;
        System.out.printf("%8f \n",a);
        System.out.println(a);
    }
}