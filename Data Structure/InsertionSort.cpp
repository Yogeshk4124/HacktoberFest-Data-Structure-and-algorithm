#include<iostream>
using namespace std;
void insertion(int a[], int n)
{
	int i,j,e;
	for(i=1;i<n;i++)
	{
		e=a[i];
		j=i-1;
		while(j>=0 && a[j]>e)
		{
			a[j+1]=a[j];
			j--;
		}
		a[j+1]=e;
	}
}
int main()
{
		int n, key, arr[1000],i;
	cin>>n;
	cout<<"Enter elements of the array : ";
	for(i =0;i<n;i++)
	{
		cin>>arr[i];
	}
	insertion(arr,n);
	for(i=0;i<n;i++)
	{
		cout<<arr[i]<<"\t";
	}
}
