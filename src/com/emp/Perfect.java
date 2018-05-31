package com.emp;

public class Perfect {
	static int tot;
public String Number(int n)
{ int i = 1;
    while(i<n) 
    {
	if(n%i==0)
	{
		tot+=i;
	}
	i++;
	}
    if(n==tot)
    {
    	return "perfect number";
    }
    else
    {
    	return "not perfect number";
    }
}
public static void main(String a[])
{
	Perfect p=new Perfect();
	String s=p.Number(28);
	System.out.println(s);
}
}
