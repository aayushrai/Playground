#include<iostream>
using namespace std;
int fact(int);
int main()
{
 int n;
  cin >> n;
 cout <<"The factorial of "<<n<<" is "<<fact(n);
}
int fact(int p){
if(p==1)
  return(1);
return p*fact(p-1);
}