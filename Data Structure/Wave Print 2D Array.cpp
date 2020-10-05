#include<iostream>
using namespace std; 
int main()
{
	int a[1000][1000]={0};
	int r,c,i,j;
	cin>>r>>c;
	for(i=0;i<c;i++)
	{
		for(j=0;j<r;j++)
		{
			cin>>a[i][j];
		}
	}
	for(i=0;i<c;i++)
	{
		for(j=0;j<r;j++)
		{
			cout<<a[i][j]<<" ";
		}
		cout<<endl;
	}
	return 0;
}
