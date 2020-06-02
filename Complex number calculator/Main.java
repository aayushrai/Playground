#include<iostream>
using namespace std;
int main(){
   int n, x1, y1, x2, y2, x3, y3;
   cin>>n;
   cin>> x1 >> y1;
   cin>> x2 >> y2;
  if(n==3){
   x3 = x1 * x2 - y1 * y2;
   y3 = x1 * y2 + y1 * x2;
     if(y3<0)
     cout<<x3<<y3<<"i ";
  else 
         cout<<x3<<"+"<<y3<<"i ";


}
  
 else if(n==2){
   x3 = x1 - x2 ;
   y3 = y1 - y2 ;
     if(y3<0)
     cout<<x3<<y3<<"i ";
  else 
         cout<<x3<<"+"<<y3<<"i ";


}
  
  else if(n==1){
   x3 = x1 + x2 ;
   y3 = y1 + y2 ;
     if(y3<0)
     cout<<x3<<y3<<"i ";
  else 
         cout<<x3<<"+"<<y3<<"i ";


}
else
  cout<<"Invalid choice";
return 0;
  }
 