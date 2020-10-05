#include<iostream>
using namespace std;
int main()
{
	int a,i,sum,n,j;
	int arr[1000];
	cin>>n;
	for(i=0;i<n;i++)
	{
		cin>>arr[i];
	}
	cout<<"Enter sum : ";
	cin>>sum;
	for(i=0;i<n;i++)
	{
		for(j=i;j<n;j++)
		{
			if(arr[j]+arr[i]==sum)
			{
				cout<<arr[i]<<" and "<<arr[j]<<endl;
			}
		}
	}
}
