package com.show;

public class Twodimensional extends Shape{
   
	public void Square()
	{
		area=(length*length);
		System.out.println("square");
		System.out.println(area);
	}
	public void Rectangle()
	{
		area=(length*width);
		System.out.println("Rectangle");
		System.out.println(area);
	}
	public void Circle()
	{
		area=3.14*(radius*radius);
		System.out.println("Circle");
		System.out.println(area);
	}
	public void Triangle()
	{
		area=(length*width)/2.0;
		System.out.println("Triangle");
		System.out.println(area);
	}
                                         }
