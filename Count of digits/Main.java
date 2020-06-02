#include<iostream>
using namespace std;
int main()
{
 int a;
  cin >> a;
  int c =0;
  if(a == 0){
  c += 1;
  }
  while(a>0){
  a = a/10;
    c+= 1;
  }
  cout<<c;
}