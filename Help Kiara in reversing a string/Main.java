#include <iostream>
#include<cstring>
using namespace std;
int main()
{
char str[100];
 cin.get(str,100);
for(int i=strlen(str)-1;i>=0;i--){
cout<<str[i];
}
}