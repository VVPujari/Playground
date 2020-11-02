#include<iostream>
using namespace std;
int main()
{
  int m,n,req,res;
  cin>>m>>n>>req;
  
  if(n==0)
    res=1;
  else if(n==1)
    res=m;
  else
  {
    res=m;
    for(int i=2;i<=n;i++)
    {
      res=res*m;
    }
  }
  
  if(res>=req)
    cout<<"Doctor, you can proceed with your experiment."<<endl;
  else
    cout<<"Sorry Doctor! You need more bacteria."<<endl;
  
  return 0;
}