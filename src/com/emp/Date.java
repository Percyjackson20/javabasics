package com.emp;

public class Date {
int day;
int month;
int year;
public Date()
{
	this.day=6;
	this.month=3;
	this.year=1998;
	
}
public int getDay() {
	int a=day;
	if(a<32&&a>0)
	{
	return a;
	}
	else
	{
	return 0;
	}
}

public void setDay(int day) {
	this.day = day;
}

public int getMonth() {
	int b=month; 
	if(b<13&&b>0)
	{
	return b;
	}
	else
	{
	return 0;
	}
}

public void setMonth(int month) {
	this.month = month;
}

public int getYear() {
	int c=year;
	return c;
}

public void setYear(int year) {
	this.year = year;
}
public String Displaydate()
{   int d=day;
    int m=month;
    int y=year;
	String S=m+"/"+d+"/"+y;
	return S;
}
public static void main(String a[])
{    
	  Date date=new Date();
	   String T=date.Displaydate();
	   int x=date.getDay();
	   int y=date.getMonth();
	   int z=date.getYear();
	   System.out.println("Date is "+T);
	   System.out.println("Day is "+x);
	   System.out.println("Month is "+y);
	   System.out.println("Year is "+z);
}

}
