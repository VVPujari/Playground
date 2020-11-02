#include <iostream>
using namespace std;
int main() 
{
  int n,temp;
  cin>>n;
  
  temp=n;
  while(temp)
  {
    int x=temp%10;
    cout<<x;
    temp=temp/10;
  }
  
  return 0;
}