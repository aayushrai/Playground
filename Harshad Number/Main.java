#include<iostream>
using namespace std;
int main()
{
  int a;
  cin >> a;
  int b = 0;
  int c = a;
  while(c>0){
  b += c%10;
  c /= 10;
  }
  if(a%b ==0)
    cout <<"Harshad Number";
  else
    cout <<"Not Harshad Number";
    
}