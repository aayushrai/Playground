#include<iostream>
using namespace std;
int main()
{
  int a,c=0;
  cin >> a;
  cout << a << endl;
  while(a != 1){
  if(a%2 == 0){
  a  = a/2;
  }
  else{
   a = (a*3)+1;
   }
   cout << a << endl;
  c += 1;
  }
  cout << c;
}