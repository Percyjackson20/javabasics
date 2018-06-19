package com.project;
import java.util.*;
public class Special {
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String s[]=sc.nextLine().split("\\s");
boolean b=false;
ab:
for(int i=0;i<s.length;i++)
{
int len=s[i].length();
for(int j=2;j<len;j++)
{
if(len%j!=0)
{
b=true; 
if((i+1)%2==0)
{
if(Character.isUpperCase(s[i].charAt(0)))
{
b=true;  
}
else
{
b=false;
break ab;
}
}
}
else
{
b=false;
break ab;
}
}
}
if(b==true)
{
System.out.println("special");
}
else
{
System.out.println("not special"); 
}
}
}


