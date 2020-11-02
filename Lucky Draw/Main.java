#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int prime = 1;
  if(n==1)
    prime=0;
  for(int i=2;i<n/2;i++)
  {
    if(n%i==0)
    {
      prime=0;
      break;
    }
  }
  
  if(prime==1)
    cout<<"Eligible";
  else
    cout<<"Not eligible";
  return 0;
}