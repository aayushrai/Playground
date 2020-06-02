#include<iostream>
using namespace std;
int main()
{
  int times;
  double heat;
  cin >> times;
  cin >> heat;
  if(times == 1){
  cout<<heat;
  }
  else if(times == 2){
  cout << heat + (heat/2);
  }
  else if(times == 3){
    cout << 2*heat;
  }
  else{
  cout <<  "Number of items is more";
  }
}