#include<iostream>
using namespace std;
int gcd(int,int);
int main()
{
 int a,b;
  cin >> a;
  cin >> b;
  cout << "G.C.D of "<<a<<" and "<<b<<" = "<<gcd(a,b);
}
int gcd(int c,int d){
if(d == 0)
  return(c);
if(c>d)
  gcd(d,c);
else
  gcd(c,d%c);
}