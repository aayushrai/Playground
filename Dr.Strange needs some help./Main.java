#include<iostream>
using namespace std;
int sq(int,int);
int main(){
int m,n,req;
  cin >> m;
  cin >> n;
  cin >> req;
  if(sq(m,n)>=req)
     cout << "Doctor, you can proceed with your experiment.";
  else
     cout << "Sorry Doctor! You need more bacteria.";
    
}
int sq(int n,int p){
  int a = n;
for(int i=0;i<p-1;i++){
 a *= n;
}
  return a;
}