#include<iostream>
using namespace std;
int fab(int);
int main()
{
  int a;
  cin >> a;
  cout << "The term "<<a<<" in the fibonacci series is "<<fab(a-1);
}
int fab(int p){
if(p == 0)
  return 0;
if(p == 1)
  return 1;
return fab(p-1)+fab(p-2);
}