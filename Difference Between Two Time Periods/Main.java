#include<iostream>
using namespace std;
struct clock{
  int hour;
  int min;
  int sec;
};

int main()
{
  struct clock stclock,endclock,diff;
  cin>>stclock.hour>>stclock.min>>stclock.sec;
  cin>>endclock.hour>>endclock.min>>endclock.sec;
  
  
  if(endclock.sec > stclock.sec){
	--stclock.min;
	stclock.sec += 60;
	}
	diff.sec = stclock.sec - endclock.sec;
	if(endclock.min > stclock.min){
	--stclock.hour;
	stclock.min += 60;
	}
	diff.min = stclock.min - endclock.min;
	diff.hour = stclock.hour - endclock.hour;
  
  	cout<<diff.hour<<":"<<diff.min<<":"<<diff.sec;
}