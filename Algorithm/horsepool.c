#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#define max 500
int t[max];
void shifttable(char p[])
{
    int i,j,m;
    m=strlen(p);
    for(i=0;i<max;i++)
        t[i]=strlen(p);
    for(j=0;j<m-1;j++)
        t[p[j]]=m-j-1;
}
int horsepool(char s[],char p[])
{
    int i,j,k,m,n;
    n=strlen(s);
    m=strlen(p);
    i=m-1;
    while(i<n)
    {
        k=0;
        while(k<m && p[m-1-k]==s[i-k])
            k++;
        if(k==m)
            return (i-m+1);
        else
            i+=t[s[i]];
    }
    return -1;
}
void main()
{
    char s[100],p[100];
    int pos;
    printf("Enter string: ");
    gets(s);
    printf("Enter pattern: ");
    gets(p);
    shifttable(p);
    pos=horsepool(s,p);
    if(pos>=0)
        printf("\nThe pattern was found at position %d", pos+1);
    else
        printf("\nPattern not found");
}
