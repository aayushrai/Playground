#include<iostream>
using namespace std;
int main()
{
int c;
  cin >> c;
  if(c <=200){
  cout <<"Rs."<<int(c*0.5);
  }
  else if(c<= 400){
   cout <<"Rs."<<(c*0.65)+100;
  }
    else if(c<= 600){
   cout <<"Rs."<<(c*0.80)+200;
  }
    else{
   cout <<"Rs."<<(c*1.25)+425;
  }
}