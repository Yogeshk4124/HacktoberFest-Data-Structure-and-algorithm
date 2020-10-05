#include<iostream>
using namespace std;
void bubble(int a[], int n)
{
	for (int i=1;i<n;i++)
	{
		for (int j=0;j<n-i;j++)
		{
			if(a[j]>a[j+1])
			{
				swap(a[j],a[j+1]);
			}
		}
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
	bubble(arr,n);
	for(i=0;i<n;i++)
	{
		cout<<arr[i]<<"\t";
	}
}
