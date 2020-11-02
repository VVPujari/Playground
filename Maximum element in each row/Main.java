
#include<iostream>
using namespace std;
int main()
{
  int m,n,res;
  cin>>m>>n;
  int a[m][n],ans[m];
  
  for(int i=0;i<m;i++)
  {
    for(int j=0;j<n;j++)
    {
      cin>>a[i][j];
    }
  }
  
  if((n==0)||(m==0))
  {
    return 0;
  }
  
  if(n>1)
  {
  for(int i=0;i<m;i++)
  {
    res=a[i][0];
    for(int j=1;j<n;j++)
    {
      if(res<=a[i][j])
      {
        res=a[i][j];
      }
    }
    ans[i]=res;
  }
  }
  else
  {
  	for(int i=0;i<m;i++)
    {
      for(int j=0;j<n;j++)
      {
        cout<<a[i][j]<<endl;
      }
    }
    return 0;
  }
  
  for(int i=0;i<m;i++)
  {
    cout<<ans[i]<<endl;
  }
  
  
  
  return 0;
}