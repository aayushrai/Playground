#include<iostream>
using namespace std;
int main()
{
 int n,a =0,b = 1;
  cin >> n;
  for(int i=0;i<n-2;i++){
      b = a+b;
      a = b-a;
  }
  cout << b;
}