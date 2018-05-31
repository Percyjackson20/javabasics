package com.emp;

public class Multiple {
public boolean Ismultiple(int a,int b)
{
	if(b%a==0)
	{
		return true;
	}
	else
	{
		return false;
	}
}
public static void main(String args[])
{
	Multiple m=new Multiple();
	boolean a=m.Ismultiple(3,6);
	System.out.println(a);
}
}
