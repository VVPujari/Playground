#include<iostream>
using namespace std;
int main()
{
  int a,b,n,res;
  cout<<"Enter first number : ";
  cin>>a;
  cout<<"Enter second number : ";
  cin>>b;
  cout<<"Menu"<<endl;
  cout<<"1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder"<<endl;
  cin>>n;
  switch(n)
  {
    case 1:
      res=a+b;
      break;
    case 2:
      res=a-b;
      break;
    case 3:
      res=a*b;
      break;
    case 4:
      res=a/b;
      break;
    case 5:
      res=a%b;
      break;
    default:
      cout<<"Invalid operation";
      return 0;
  }
  cout<<res<<endl;
  
  return 0;
}