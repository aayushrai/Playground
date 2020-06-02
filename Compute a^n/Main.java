#include<iostream>
using namespace std;
int power(int,int);
int main()
{
 int a,b;
  cout << "Enter the value of a\n";
  cin >> a;
  cout << "Enter the value of n\n";
  cin >> b;
  cout << "The value of "<<a <<" power "<<b<<" is "<<power(a,b);
}
int power(int c,int d){
if(d == 0)
  return 1;
return(c*power(c,d-1));
}