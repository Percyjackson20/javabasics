package com.basics;
import java.util.Scanner;
public class calculator {
public static void main(String a[])
{
int a1;
int t1,t2;
Scanner s1=new Scanner(System.in);
Scanner s2=new Scanner(System.in);
Scanner s3=new Scanner(System.in);
t1=s2.nextInt();
t2=s3.nextInt();
System.out.println("addition=1");
System.out.println("subtraction=2");
System.out.println("multiplication=3");
System.out.println("divition=4");
a1=s1.nextInt();
switch(a1)
{
case 1:
	System.out.println(t1+t2);
	break;
case 2:
	System.out.println(t1-t2);
	break;
case 3:
	System.out.println(t1*t2);
	break;
case 4:
	System.out.println(t1/t2);
	break;
default:
	System.out.println("none");
	break;
	
}
}
}

