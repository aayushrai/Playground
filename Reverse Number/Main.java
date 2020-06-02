#include <iostream>
using namespace std;
int main() 
{
	int a,b =0,l;
  cin >> a;
  
  while(a>0){
   l = a%10;
    a = a/10;
    b = b*10 + l;
  }
  cout <<b;
	return 0;
}