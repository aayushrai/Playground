#include<iostream>
#include <string.h> 
using namespace std;
struct Student { char name[30]; char department[20]; int yearOfStudy; float cgpa; };

int comparator(const void* p, const void* q) 
{ 
    return strcmp(((struct Student*)p)->name, 
                  ((struct Student*)q)->name); 
} 

int main()
{
cout<<"Enter the number of students"<<endl;
  int n;
  cin>>n;
  Student s[n];
  for(int i=0;i<n;i++){
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
      qsort(s, n, sizeof(struct Student), comparator); 
  cout<<"Details of students"<<endl;
    for(int i=0;i<n;i++){
  cout<<"Student "<<i+1<<endl;
              cout<<"Name:"<<s[i].name<<endl;

              cout<<"Department:"<<s[i].department<<endl;

              cout<<"Year of study:"<<s[i].yearOfStudy<<endl;

              cout<<"CGPA:"<<s[i].cgpa<<endl;

      
    }
}