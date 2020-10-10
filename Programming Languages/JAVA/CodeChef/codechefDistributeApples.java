package CodeChef;


import java.util.*;

class codechefDistributeApples
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        
        int t=in.nextInt();
        int i=0;
        while(i<t)
        {
            int n=in.nextInt();
            int k=in.nextInt();
            
             if (k == 1)
             {
                 System.out.println("NO");
             }
             else
             {
                 if ((n/k)%k == 0)
                 System.out.println("NO");
                 else
                 System.out.println("YES");
             }
            i++;
        }
    }
}