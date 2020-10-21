#include<stdio.h>
int main()
{
    int s[]={3,0,5,6,1,3,5,12,2,8,8};
    int f[]={5,6,9,10,4,9,7,16,14,12,11};
    int n=sizeof(f)/sizeof(f[0]);
    printf("Input\n");
    printf("JobId\tStart Time\tEnd Time\n");
    for(int i=0;i<n;i++)
        printf("%d\t%d\t\t%d\n",i+1,s[i],f[i]);
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n-1-i;j++)
        {
            if(f[j+1]>f[j])
            {
                int c=f[j];
                f[j]=f[j+1];
                f[j+1]=c;
                c=s[j];
                s[j]=s[j+1];
                s[j+1]=c;
            }
        }
    }
    printf("Sorted :\n");
    printf("JobId\tStart Time\tEnd Time\n");
    for(int i=0;i<n;i++)
        printf("%d\t%d\t\t%d\n",i+1,s[i],f[i]);
    int x[n];
    for(int i=0;i<n;i++)
        x[i]=0;
    int count=1;
    x[0]=1;
    int k=0;
    for(int i=1;i<n;i++)
    {
        if(f[i]<=s[k])
        {
            x[i]=1;
            k=i;
        }
    }
    printf("Job Id\tSolution\n");
    for(int i=0;i<n;i++)
        printf("%d \t%d\n",i+1,x[i]);
    printf("\nSelected jobs are: ");
    for(int i=0;i<n;i++)
        if(x[i]==1)
            printf("%d  ",i+1);
}