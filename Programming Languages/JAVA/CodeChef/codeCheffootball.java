package CodeChef;

import java.util.Scanner;

class codeCheffootball
{
    public static int main(String []args)
    {
        Scanner in=new Scanner(System.in);
       
        int t=in.nextInt();
        int i=0;
        while(i<t)
        {
            int n=in.nextInt();
            
            int a[]=new int[n];
            int b[]=new int[n];
            int c[]=new int[n];
            for(int j=0;j<n;j++)
            a[j]=in.nextInt();
            
            for(int j=0;j<n;j++)
            b[j]=in.nextInt();
            
            for(int j=0;j<n;j++)
            c[j]=(a[j]*20)-(b[j]*10);
            
            int max=c[0];
            for(int j=0;j<n;j++)
            {
                c[j]=c[j]<0?0:c[j];
                if(c[j]>max)
                max=c[j];
            }
            System.out.println(max);
            i++;
        }
        return 0;
    }
}
