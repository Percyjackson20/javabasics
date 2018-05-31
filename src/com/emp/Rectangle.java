package com.emp;

public class Rectangle {
	double length;
	double width;
	public Rectangle()
	{
		
	}
	public double getLength() {
		return length;
	}
	public double setLength(double length) {
		if(length>0.0&&length<20.0)
		{
		this.length = length;
		return length;
		}
		else
		{
			return 0.0;
		}
	}
	public double getWidth() {
		return width;
	}
	public double setWidth(double width) {
		if(width>0.0&&width<20.0)
		{
		this.width = width;
		return width;
		}
		else
		{
		return 0.0;
		}
	}
	public double area()
	{
		double a=length*width;
		return a;
	}
	public double perimeter()
	{
		double p=(length+width)*2;
		return p;
	}
	public static void main(String a[])
	{
		Rectangle r=new Rectangle();
		r.setLength(2.0);
		r.setWidth(8.0);
		System.out.println("area="+r.area());
		System.out.println("perimeter="+r.perimeter());
		
	}
	}


