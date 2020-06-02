#include<iostream>
using namespace std;
int main(){
 int a = 1,f;
  cin >>f;
  for(int i = 2;i<=f;i++)
    a *= i;
  cout << a;
}