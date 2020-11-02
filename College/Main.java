#include<iostream>
using namespace std;

struct College 
{
  string name; 
  string city; 
  int establishmentYear; 
  float passPercentage; 
}; 

int main()
{
  int n;
  cout<<"Enter the number of colleges"<<endl;
  cin>>n;
  struct College clg[n],temp;
  
  //Input details
  for(int i=0;i<n;i++)
  {
    cout<<"Enter the details of college "<<i+1<<endl;
    cout<<"Enter name"<<endl;
    cin>>clg[i].name;
    cout<<"Enter city"<<endl;
    cin>>clg[i].city;
    cout<<"Enter year of establishment"<<endl;
    cin>>clg[i].establishmentYear;
    cout<<"Enter pass percentage"<<endl;
    cin>>clg[i].passPercentage;
  }
  
  //Sorting
  
  for(int i=0;i<n;i++)
  {
    for(int j=i+1;j<n;j++)
    {
      if(clg[i].name>clg[j].name)
      {
        temp=clg[i];
        clg[i]=clg[j];
        clg[j]=temp;
      }
    }
  }
  
  //Display details
  cout<<"Details of colleges"<<endl;
  for(int i=0;i<n;i++)
  {
    cout<<"College:"<<i+1<<endl;
    cout<<"Name:"<<clg[i].name<<endl;
    cout<<"City:"<<clg[i].city<<endl;
    cout<<"Year of establishment:"<<clg[i].establishmentYear<<endl;
    cout<<"Pass percentage:"<<clg[i].passPercentage<<endl;
  }
  
  return 0;
}