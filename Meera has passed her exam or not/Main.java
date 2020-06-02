#include<iostream>
using namespace std;
int main()
{
int a,b;
cin >> a;
int arr[a];
for(int i = 0;i <a;i++) 
   cin >> arr[i];
cin >> b;
bool t = false;
for(int i = 0;i <a;i++) {
  if(arr[i] == b){
    t = true;
    break;}}
if(t)  
  cout << "She passed her exam";
else
  cout << "She failed";
}