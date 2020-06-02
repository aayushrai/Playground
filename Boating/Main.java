#include<iostream>
using namespace std;
int main()
{
  int w,c,a;
  cin >> w;
  cin >> a;
  cin >>c;
  w -= a * 75;
  w -= c * 30;
  if(w<0){
  cout<<"Boat will drow";
  }
  else{
   cout<<"Boat is stable"; 
  }
}