#include<stdio.h>
#include <stdlib.h>

int main()
{
int a,b;
scanf("%d",&a);
scanf("%d",&b);
int a1=0,b1=0;
while(a>0 || b>0)
{
   int r=a%10;
   a1=a1*10+r;
   a/=10;
   r=b%10;
   b1=b1*10+r;
   b/=10;
}
a=a1+b1;
while(a>0)
{
    int r=a%10;
    printf("%d",r);
    a/=10;
}
}
