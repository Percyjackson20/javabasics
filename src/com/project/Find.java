package com.project;
import java.util.*;
public class Find {
	static String f="";
	static int l3=0,h=0;
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	s=s.toUpperCase();
	char c1='\0',c2='\0';
	String[] s1=new String[s.length()];
	for(int j=0;j<s.length();j++)
	{
	s1=s.split("\\s");
	h=s1.length;
	//System.out.println(s1[j]);
	int a1[]=new int[s.length()];
	a1[j]=s1[j].length();
	//System.out.println(a1[j]);
	  if(a1[j]%2==0)
	    {
	    int n2=0;
	    for(int l=0,k=a1[j]-1;l<k;l++,k--)
	    {
	      // System.out.println(s1[j].charAt(l));
	       //System.out.println(s1[j].charAt(k));
	      c1=s1[j].charAt(l);
	      c2=s1[j].charAt(k);
	      n2+=Value(c1,c2);
	    }
	    ans(n2);
	    }
	    else
	    {
	        int n3=0,n2=0;
	   for(int l=0,k=a1[j]-1;l<=k;l++,k--)
	    {
	        if(l!=k)
	        {
	       c1=s1[j].charAt(l);
	       c2=s1[j].charAt(k);
	        n2+=Value(c1,c2);
	        }
	        else
	        {
	        n3=mat(s1[j].charAt(l));  
	       // System.out.println(s1[j].charAt(l));
	        }
	    }
	    n2=n2+n3;
	    ans(n2);
	    }
	}
	}
	public static int Value(char c1,char c2)
	{  
	    int t=0;
	t += Math.abs(c1-c2);
	return t;
	}

	public static int mat(char c3)
	{
	int m=0,i=1;
	char a[]=new char[27];
	for(char c='A';c<='Z';c++)
	{
	a[i]=c;
	if(a[i]==c3)
	{
	m=i;
	}
	i++;
	}
	return m;
	}

	public static void ans(int n2)
	{
	f += String.valueOf(n2);
	l3++;
	//System.out.println(h+" "+l3);
	if(l3==h)
	{
	System.out.println(f);   
	}
	}
}


