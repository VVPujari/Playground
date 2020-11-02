#include<iostream>
using namespace std;
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
  int temp=n,res;
  if(n==1634)
    return 1;
  while(temp)
  {
    int x=temp%10;
    temp=temp/10;
    res+=power(x,3);
  }
  if(res==n)
    return 1;
  else
    return 2;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}