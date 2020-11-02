#include<iostream>
#include<string.h>
using namespace std;

struct student
{
  string name;
  string department;
  int yearOfStudy;
  float cgpa;
};

int main()
{
  int n;
  cout<<"Enter the number of students"<<endl;
  cin>>n;
  
  struct student s[n];
  struct student temp;
  {
    
  };
  
  for(int i=0;i<n;i++)
  {
    cout<<"Enter the details of student "<<i+1<<endl;
    cout<<"Enter name"<<endl;
    cin>>s[i].name;
    cout<<"Enter department"<<endl;
    cin>>s[i].department;
    cout<<"Enter year of study"<<endl;
    cin>>s[i].yearOfStudy;
    cout<<"Enter cgpa"<<endl;
    cin>>s[i].cgpa;
  }

  
  for (int i = 0; i < n; i++)
  {
    for(int j=i+1;j<n;j++)
    {
      if(s[i].name>s[j].name)
      {
        temp=s[i];
        s[i]=s[j];
        s[j]=temp;

        
      }
    }
  }
  
  
  
  cout<<"Details of students"<<endl;
  
  for(int i=0;i<n;i++)
  {
    cout<<"Student "<<i+1<<endl;
    cout<<"Name:"<<s[i].name<<endl;
    cout<<"Department:"<<s[i].department<<endl;
    cout<<"Year of study:"<<s[i].yearOfStudy<<endl;
    cout<<"CGPA:"<<s[i].cgpa<<"\n";
    
  }
  
  return 0;
}