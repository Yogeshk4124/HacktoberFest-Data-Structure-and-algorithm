#include <iostream>
#include<algorithm>
using namespace std;

int main() {
  int coins[]={1,2,5,10,20,50,100,200,500,2000};
  int size=sizeof(coins)/sizeof(int);
  int n,max;
  cout<<"Enter total money : ";
  cin>>n;
  while(n>0)
  {
  int i,j;
  for(i=0;i<size;i++)
  {
      if(n<coins[i])
      {
        cout<<coins[i-1]<<endl;
        n=n-coins[i-1];
        break;
      }
  }
  }
}
