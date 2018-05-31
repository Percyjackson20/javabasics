package com.emp;

public class Rectangle {
	double length;
	double width;
	public Rectangle()
	{
		length=1.0;
		width=1.0;
	}
	public double getLength() {
		return length;
	}
	public double setLength(double length) {
		this.length = length;
		return length;
	}
	public double getWidth() {
		return width;
	}
	public double setWidth(double width) {
		this.width = width;
		return width;
	}
	public double area()
	{
		if(width>0.0&&width<20.0&&length>0.0&&length<20.0)
		{
		double a=length*width;
		return a;
		}
		else
		{
		return 0.0;
		}
	}
	public double perimeter()
	{
		if(width>0.0&&width<20.0&&length>0.0&&length<20.0)
		{
		double p=(length+width)*2;
		return p;
		}
		else
		{
		return 0.0;
		}
	}
	public static void main(String a[])
	{
		Rectangle r=new Rectangle();
		r.setLength(7.0);
		r.setWidth(8.0);
		System.out.println("area="+r.area());
		System.out.println("perimeter="+r.perimeter());
		
	}
	}


