package com.emp;

public class Command {
	public static void main(String a[])
{ int i;
double sum=0;
   for(i=0;i<=5;i++)
   {
	sum=sum+Double.parseDouble(a[i]); 
   }  
	    System.out.println(sum);
}
}
