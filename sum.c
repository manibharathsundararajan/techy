#include<conio.h>
#include<stdio.h>
void main()
{
int i;
scanf("%d",&i);
if(i>0&&i!=0)
{
printf("the number is positive");
}
else if(i<0)
{
printf("the number is negative");
}
else
{
printf("the number is zero");
}
getch();
}
