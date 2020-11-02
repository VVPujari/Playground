#include<iostream>
using namespace std;
int main()
{
  int mw,wf;
  cin>>mw>>wf;
  if(mw>wf)
    cout<<"Yes, you can enter."<<endl;
  else if(mw==wf)
    cout<<"Yes, you can enter. Kindly use a rope."<<endl;
  else
    cout<<"Sorry, you can't enter"<<endl;
  
  return 0;
}