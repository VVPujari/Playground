#include<iostream>
using namespace std;
int main()
{
  int n,temp,count=0;
  cin>>n;
  temp=n;
  do
  {
    count++;
    temp=temp/10;
  }while(temp);
  cout<<count;
  return 0;
}