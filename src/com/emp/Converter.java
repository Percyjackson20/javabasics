package com.emp;

public class Converter {
public double celsius(double a)
{
	double f=9.0/5.0*(a-32);
	return f;
}
public double fahrenheit(double b)
{
	double c=9.0/5.0*(b-32);
	return c;
}
public static void main(String a[])
{
	Converter x=new Converter();
	double fahrenheit=x.celsius(20.0);
	double celsius=x.fahrenheit(40.0);
	System.out.println(fahrenheit+"F");
	System.out.println(celsius+"C");
}
}
