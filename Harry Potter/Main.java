#include<iostream>
using namespace std;
int main()
{
 int num;
  cin >> num;
  cout << num%10 + (num/1000)%10;
}