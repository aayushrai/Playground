#include<iostream>
using namespace std;
int main(){
int a,b;
  cin >> a;
  cin >> b;
  for(int j =a;j<b;j++){
  int sm = 0;
  for(int i =1;i<j;i++){
     if(j%i == 0)
       sm += i ;
  }
  if(sm == j)
    cout << sm <<" ";
  }
 
}