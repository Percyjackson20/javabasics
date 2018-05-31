package com.emp;

public class Even {
public boolean Iseven(int a)
{
	if(a>1)
	{
	if(a%2==0)
	{
		return true;
	}
	else
	{
		return false;
	}
	}
	else
	{
		return false;
	}
}
public static void main(String a[])
{
	Even e=new Even();
	 boolean b=e.Iseven(4);
	 boolean c=e.Iseven(5);
	 System.out.println(b);
	 System.out.println(c);
}
}
