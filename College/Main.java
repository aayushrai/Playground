#include<iostream>
#include<iomanip>
using namespace std;
struct College{
  char name[100]; 
  char city[100]; 
  int establishmentYear; 
  float passPercentage;
};
int main()
{
  College cllg[100];
  int n,i;
  cout<<"Enter the number of colleges";
  cin>>n;
  for( i=1;i<=n;i++){
    cout<<"\nEnter the details of college "<<i;
    cout<<"\nEnter name";
    cin>>cllg[i].name;
    cout<<"\nEnter city";
    cin>>cllg[i].city;
    cout<<"\nEnter year of establishment";
    cin>>cllg[i].establishmentYear;
    cout<<"\nEnter pass percentage";
    cin>>cllg[i].passPercentage;
    
  }
  
  cout<<"\nDetails of colleges";
  
  for(i=1;i<=n;i++){
    cout<<"\nCollege:"<<i;
    cout<<"\nName:"<<cllg[i].name;
    cout<<"\nCity:"<<cllg[i].city;
    cout<<"\nYear of establishment:"<<cllg[i].establishmentYear;
    cout<<"\nPass percentage:"<<cllg[i].passPercentage;
  }
}