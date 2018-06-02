package com.array;

public class Minmax {
int a[]= {3,4,5,2,33,24,2};
public void Max()
{   int s=a[0];
	for(int i=0;i<a.length;i++)
	{
	if(a[i]>s)
	{
		s=a[i];
	}
	}
	System.out.println("Maximum ");
	System.out.println(s);
}
public void Min()
{   int s=a[0];
	for(int i=0;i<a.length;i++)
	{
	if(a[i]<s)
	{
		s=a[i];
	}
	}
	System.out.println("Minimum ");
	System.out.println(s);
}
public static void main(String args[])
{
	Minmax m=new Minmax();
	m.Max();
	m.Min();
}
}
