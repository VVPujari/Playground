#include<iostream>
using namespace std;
int main()
{
  int t,fc=0,mc=0;
  cin>>t;
  int a[t];
  
  for(int i=0;i<t;i++)
  {
    cin>>a[i];
  }
  
  for(int i=0;i<t;i++)
  {
    if(a[i]%2==0)
      fc++;
    else
      mc++;
  }
  
  cout<<mc<<endl;
  cout<<fc<<endl;
  
  return 0;
}