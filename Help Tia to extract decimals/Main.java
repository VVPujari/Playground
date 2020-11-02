#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
  string fnum;
  //Type your code here
  
  getline(cin,fnum);
  size_t found=fnum.find(".");
	
  cout<<"Floating part is : ";
  if (found!=std::string::npos)
  {
    for(int i=found+1;i<fnum.size();i++)
    {
      cout<<fnum[i];
    }
  }
 
  
  return 0;
}