#include<iostream>
using namespace std;
int main()
{
  float mil;
  int petrol,distance;
  cin >> mil;
  cin >> petrol;
  cin >> distance;
  int dis = mil * petrol;
  if(dis >= distance)
    cout << "Can reach";
  else
    cout << "Cannot reach";
    
  
   
}