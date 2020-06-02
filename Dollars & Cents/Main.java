#include<iostream>
using namespace std;
int main()
{
 int doller1,doller2,cent1,cent2;
  cin >> doller1;
  cin >> cent1;
  cin >> doller2;
  cin >> cent2;
  int total = 0;
  total += (cent1 + cent2)/100;
  total += doller1 + doller2;
  cout << total << endl;
  cout <<(cent1 + cent2)%100;
}