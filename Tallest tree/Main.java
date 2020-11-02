#include <iostream>
#include <algorithm>
using namespace std;

struct TreeHeight
{
  int feets;
  int inches;
};

int TallestTree(struct TreeHeight trees[],int n)
{
  int arr[n],height,tallest;
  
  for(int i=0;i<n;i++)
  {
    height=(12*trees[i].feets)+trees[i].inches;
    arr[i]=height;
  }
  
  tallest=*max_element (arr, arr+n);
  
  return tallest;
}

int main() 
{
  // Try out your code here
  int n,res;
  cin>>n;
  struct TreeHeight trees[n];
  
  for(int i=0;i<n;i++)
  {
    cin>>trees[i].feets;
    cin>>trees[i].inches;
  }
  
  res= TallestTree(trees,n);
  cout<<res;
  return 0;
}