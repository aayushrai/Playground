#include<iostream>
using namespace std;
int main()
{
  int dob,curr,diff;
  cin >> dob;
  cin >> curr;
  diff = curr - dob;
  if(diff < 0)
  {
  cout << (100+curr) - dob;
  }
  else{
  cout<<diff;
  }
  
}