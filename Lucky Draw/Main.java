#include<iostream>
using namespace std;
int main(){
int n;
  bool t = true;
  cin >> n;
  if(n<=1){
    cout <<"Not eligible";
    t = false;}
  for(int i = 2;i<=n/2;i++){
   if(n%i == 0){
   cout <<"Not eligible";
   t = false;
   break;
   }
  }

  if(t)
    cout <<"Eligible";
  
}