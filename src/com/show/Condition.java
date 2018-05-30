package com.show;

public class Condition {
public static void main(String a[])
{
	int i=0,j=1,k,l;
	while(i<=5)
	{
		System.out.println("i="+i);
		i++;
	}
	do
	{
		System.out.println("j="+j);
		j++;
	}while(j>5);
outer:	for(k=0;k<5;k++)
	{
	inner:	for(l=6;l>1;l--)
		{
			System.out.println("l="+l);
			if(l==2)
			{
				continue outer; 
			}
			if(k==4)
		    {
		    continue inner;
		     }
		}
	        System.out.println("k="+k);
	}
}
}
