#include<iostream>
using namespace std;
void selection(int a[], int n)
{
	
	for(int i=0;i<n-1;i++)
	{
		int min=i;
		for(int j=i;j<n;j++)
		{
			if(a[j]<a[min])
			{
				min=j;
			}
		}
		swap(a[i], a[min]);
	}
}
int main()
{
	int n, key, arr[1000],i;
	cin>>n;
	cout<<"Enter elelemnts of the array : ";
	for(i =0;i<n;i++)
	{
		cin>>arr[i];
	}
	selection(arr,n);
	for(i=0;i<n;i++)
	{
		cout<<arr[i]<<"\t";
	}
	
}

