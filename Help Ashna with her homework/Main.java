#include<iostream>
using namespace std; 
int main()
{
  int a, b,sum, dif, pro, quo, rem; 
  cin>>a>>b; 
  
  sum=a+b;
  dif=a-b;
  pro=a*b;
  quo=a/b;
  rem=a%b;
  
  cout<<"a+b="<<sum<<endl; 
  cout<<"a-b="<<dif<<endl; 
  cout<<"a*b="<<pro<<endl; 
  cout<<"a/b="<<quo<<endl; 
  cout<<"a%b="<<rem<<endl; 
  
  
  
  return 0;
}