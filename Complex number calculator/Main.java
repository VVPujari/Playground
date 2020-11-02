#include<iostream>
using namespace std;

struct complex
{
  int x;
  int y;
}a,b,res;

int main()
{
  int ch;
  cin>>ch;
  cin>>a.x;
  cin>>a.y;
  cin>>b.x;
  cin>>b.y;
  
  switch(ch)
  {
    case 1:
      res.x=a.x+b.y;
      res.y=a.y+b.y;
      break;
    case 2:
      res.x=a.x-b.x;
      res.y=a.y-b.y;
      break;
    case 3:
      res.x=(a.x*b.x)-(a.y*b.y);
      res.y=(a.x*b.y)+(b.x*a.y);
      break;
    default:
      cout<<"Invalid choice"<<endl;
      return 0;
  }
  
  if(res.y>0)
    cout<<res.x<<"+"<<res.y<<"i"<<endl;
  else
    cout<<res.x<<res.y<<"i"<<endl;
  return 0;
}