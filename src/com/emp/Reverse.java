package com.emp;

public class Reverse {
public int Reverser(int n)
{ int r=0;
	while(n>0)
	{
		r=r*10;
		r=r+n%10;
		n=n/10;
	}
	return r;
}
public static void main(String args[])
{
	Reverse a=new Reverse();
	 int c=a.Reverser(7651);
	System.out.println(c);
}
}
