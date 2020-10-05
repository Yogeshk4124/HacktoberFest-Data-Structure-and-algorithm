#include<stdio.h>
void main()

{
    int i,j,n,temp,a[20];
    printf("Enter the size of the array");
    scanf("%d",&n);
    printf("Enter the elements of array");
    for(i=0;i<n;i++)
    {
       scanf("%d",&a[i]);
    }
    for(i=1;i<n;i++){
      temp=a[i];
      j=i-1;
      while((temp<a[j])&&(j>=0)){
         a[j+1]=a[j];
         j=j-1;
      }
      a[j+1]=temp;
   }

   printf("Order of Sorted elements: ");
   for(i=0;i<n;i++)
      printf(" %d",a[i]);


}
