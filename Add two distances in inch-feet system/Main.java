#include<iostream>
using namespace std;

struct distance
{
  int feet;
  float inch;
}a,b,res;

int main()
{
  cin>>a.feet>>a.inch;
  cin>>b.feet>>b.inch;
  
  res.feet=a.feet+b.feet;
  res.inch=a.inch+b.inch;
  
  if(res.inch>12)
  {
    res.feet=res.feet+1;
    res.inch=res.inch-12;
  }
  
  cout<<res.feet<<"\'-"<<res.inch<<"\""<<endl;
  return 0;
}