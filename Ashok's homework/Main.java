#include<iostream>
using namespace std;
int main()
{
 int m,n;
  cin >> m;
  cin >> n;
 int arr[m][n],arr2[m][n];
  for(int i=0;i<m;i++){
  for(int j=0;j<n;j++){
    cin >> arr[i][j];
  }}
  for(int i=0;i<m;i++){
  for(int j=0;j<n;j++){
    cin >> arr2[i][j];
  }}
   for(int i=0;i<m;i++){
  for(int j=0;j<n;j++){
    cout <<arr[i][j]+arr2[i][j]<<" ";
  }
   cout <<"\n";
   }
   
  
}