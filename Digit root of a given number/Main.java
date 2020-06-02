#include<iostream>
using namespace std;
int digit(int);
int main(){
int a;
cin >> a;
cout <<digit(a);
}

int digit(int c){
if(c <= 9)
  return(c);
int sm = 0;
while(c >0){
 sm += (c%10);
  c /= 10;
}
digit(sm);
}