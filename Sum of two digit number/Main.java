#include<stdio.h>
int main()
{
  //Type your code here
  int num,sum=0,r;
    scanf("%2d",&num);
    while(num)
    {
        r=num%10;
        num=num/10;
        sum=sum+r;
    }
    printf("%d",sum);
  return 0;
}