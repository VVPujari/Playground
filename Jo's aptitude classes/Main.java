#include <iostream>
using namespace std;
int main()
{
  int x,y,z,res;
  int d,i;

  cin>>x>>y>>z>>res;
  d=1;
  i=1;
  while(i<=x&&i<=y&&i<=z)
  {
    if(x%i==0&&y%i==0&&x%i==0)
      d=i;
    i++;
  }
  
  if(res==d)
    cout<<"Answer is correct."<<endl;
  else
    cout<<"Answer is wrong."<<endl;

return 0;
}