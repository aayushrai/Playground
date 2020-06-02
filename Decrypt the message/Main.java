#include<iostream>
using namespace std;
int main(){
int a,b,sm = 0;
  cin >> a;
  cin >> b;
  for(int i =1;i<a+b;i++){
     if((a+b)%i == 0)
       sm += i ;
  }
 
  if(sm == (a+b))
    cout<<"They can read the message";
  else
    cout << "They can't read the message";
}