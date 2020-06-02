#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    int digit = 0;
    int p = n;
    int p2 = n;
    while(p>0){
    p /= 10;
      digit += 1;
    }
  while(p2>0){
  int l = p2%10;
  p2 /= 10;
  p += power(l,digit);
  }
  if(p == n)
    return 1;
  else
    return 0;
  
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}