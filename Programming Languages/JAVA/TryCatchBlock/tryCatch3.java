package TryCatchBlock;


import java.util.*;

class tryCatch3
{
    public static void main()
    {
        for(int i=0;i<4;i++)
        {
            try
            {
                switch(i)
                {
                    case 1 :    int b[]={ };   int j=b[0]; break;
                    case 2 :    int a[]=new int[0];     System.out.println(a[12]);   break;
                    case 3 :    System.out.println(13/0);   break;
                }
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}