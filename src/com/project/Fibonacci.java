package com.project;

public class Fibonacci {
public static void main(String[] args) {
int t1=0,t2=1,t3=0;
int input1=6;
int output1=0;
if(input1==1)
{
output1=0;
}
else
{
while(input1>1)
{
t3=t1+t2;
t1=t2;
t2=t3;
input1--;
}
output1=t1;
}
System.out.println(output1);
}
}


