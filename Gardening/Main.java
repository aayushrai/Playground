#include<iostream>
using namespace std;
int main()
{
  int row,col,tree;
  cin >> row;
  cin >> col;
  cin >> tree;
  if((tree > row && tree <= row*2) || (tree <= ((row*col)-row) && tree > ((row*col)-2*row)))
    cout << "It is a mango tree";
  else
    cout << "It is not a mango tree";
  
}