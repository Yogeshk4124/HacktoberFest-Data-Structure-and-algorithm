#include<stdio.h>
int main()
{
    int p[]={10,5,15,7,6,18,3};
    int w[]={2,3,5,7,1,4,1};
    int m=15,n=7;
    float pr[7];
    for(int i=0;i<n;i++)
        pr[i]=(float)p[i]/w[i];
    printf("Input \n");
    printf("Profit\tWeight\tRatio\n");
    for(int i=0;i<n;i++)
        printf("%d\t%d\t%f\n",w[i],p[i],pr[i]);
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n-1-i;j++)
        {
            if(pr[j+1]>pr[j])
            {
                int c=pr[j];
                pr[j]=pr[j+1];
                pr[j+1]=c;
                int k=w[j];
                w[j]=w[j+1];
                w[j+1]=k;
                int h=p[j];
                p[j]=p[j+1];
                p[j+1]=h;
            }
        }
    }
    printf("\nThe output\n");
    printf("Profit\tWeight\tRatio\n");
    for(int i=0;i<n;i++)
        printf("%d\t%d\t%f\n",w[i],p[i],pr[i]);
    float x[n];
    for(int i=0;i<n;i++)
        x[i]=0;
    int weight=0;
    for(int i=0;i<n;i++)
    {
        if(weight+w[i] <= m)
        {
            x[i]=1;
            weight+=w[i];
        }
        else
        {
            int temp=m-weight;
            x[i]=(float)temp/w[i];
            break;
        }
        
    }
    printf("\nSolution vector : ");
    for(int i=0;i<n;i++)
        printf("%f   ",x[i]);



}
