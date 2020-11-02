#include <iostream>
using namespace std;

int countDigitOccurances(int l,int u,int x)
{
  int count=0,temp;
  for(int i=l;i<=u;i++)
  {
    temp=i;
    while(temp)
    {
      if(temp%10==x)
        count++;
      temp=temp/10;
    }
  }
  return count;
}

int main() 
{
  // Try out your code here
  
  int result,l,u,x;
  cin>>l>>u>>x;
  
  result=countDigitOccurances(l,u,x);
  cout<<result;
  
  return 0;
}