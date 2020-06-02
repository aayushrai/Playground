#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,i,count=1,sum=2;
  cin>>n;
  int arr[n];
  
  for(i=0;i<n;i++){
    cin>>arr[i];
  }
  cout<<count<<"\n";
  for(i=0;i<n-1;i++){
   if(arr[i+1]>arr[i]){
     cout<<sum<<"\n";
      sum+=2;
   }
      
    else{
      cout<<count<<"\n";
    }
  }
  
}