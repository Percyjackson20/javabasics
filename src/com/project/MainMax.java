package com.project;

public class MainMax {
static int max=0;
static int min=0;
static int t=0;
public void findpassword(int a,int b,int c,int d,int e)
{ 
show(a);
show(b);
show(c);
show(d);
show(e);

}
public static void show(int x){
String s=String.valueOf(x);
String a="";
int count=0;
for(int i=0;i<s.length();i++)
{
for(int j=0;j<s.length();j++)
{
if(s.charAt(i)==s.charAt(j))
{ 
if(i!=j)
{
count=1;
a += s.charAt(i); 
}
}
}
}
if(count==0)
{
if(x>max)
{
max=x;
}
}
else
{
if(a.equals(s)==true)
{ 
if(x>max)
{
max=x;
}
}
else
{
if(t==0)
{
min=x;
t++;
}
else
{
if(min>x)
{
min=x;
}
}
}
}
}
public static void main(String[] args) {
MainMax stable=new MainMax();
stable.findpassword(1313,12,122,678,898);
int m=max+min;
System.out.println(m);
}
}



