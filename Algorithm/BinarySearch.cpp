#include<bits/stdc++.h>
using namespace std;
int BinarySearch(int arr[],int n,int x)
{int high=n-1;
  int low=0;
  int mid=(high+low)/2;
  while(low<=high)
  { 
  if(x==arr[mid])
    return mid;
  else if(x<arr[mid])
     high=mid-1;
   else if(x>arr[mid])
     low=mid+1;}
     return -1;}
  int main()
  {int n;
   cin>>n;
   int arr[n];  /*This array must be sorted for binary search to work*/
   int i;
   for(i=0;i<n;i++)
    cin>>arr[i];
    cin>>x;
    cout<<BinarySearch(arr,n,x);}
  
