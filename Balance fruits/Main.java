#include <iostream>
using namespace std;

int BalanceFruits(int a,int m,int rs)
{
  int res;
  
  if(a==m)
    return rs;
  else if(a>m)
  {
    res=a-m;
    res=rs-res;
  }
  else if(m>a)
  {
    res=m-a;
    res=res+rs;
  }
  
  return res;
}

int main() 
{
  // Try out your code here
  int a,m,rs,result;
  cin>>a>>m>>rs;
  result= BalanceFruits(a,m,rs);
  cout<<result;
  return 0;
}