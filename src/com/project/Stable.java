package com.project;

public class Stable {
	
public int findpassword(int a,int b,int c,int d,int e)
{ 
	int p1=show(a);
	int p2=show(b);
	int p3=show(c);
	int p4=show(d);
	int p5=show(e);
	int p=p1+p2+p3+p4+p5;
	return p;
}
public static int show(int x){
String s=String.valueOf(x);
String a="";
int password=0;
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
	return password;
}
else
{
}
if(a.equals(s)==true)
{ 
return password;
}
else
{
password=Integer.parseInt(s);
return password;
}
}


public static void main(String[] args) {
	Stable stable=new Stable();
	System.out.println(stable.findpassword(1313,12,122,678,898));
}
}




