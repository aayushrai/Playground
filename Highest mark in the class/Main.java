#include<iostream>
using namespace std;
int main()
{
  int a;
  cin >> a;
  int arr[a];
  int mx = 0;
  for(int i = 0; i<a;i++){
  cin >> arr[i];
  }
  for(int i = 0; i<a;i++){
  if(arr[i] > mx)
    mx = arr[i];
  }
  cout << mx;
}