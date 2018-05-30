package com.cars;

public class Car {

	String model;
	double speed;
	
	public Car()
	{
		
	}
	public String getModel(String b) {
		model=b;
		return model;
	}

	public void setModel() {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public boolean start()
	{
		return true;
	}
	public double acclerate(int a)
	{    speed=a*10;
		 speed+=10;
		return speed;
	}
	public static void main(String a[])
	{
		Car c1=new Car();
		Car c2=new Car();
		 String m1=c1.getModel("BMW");
		 String m2=c2.getModel("Ford");
		 System.out.println(m1);
		 System.out.println(m2);
		boolean t1=c1.start();
		boolean t2=c2.start();
		if(t1==true||t2==true) 
		{
		double s1=c1.acclerate(2);
		double s2=c2.acclerate(4);
		System.out.println(s1);
		System.out.println(s2);
		}
		else
		{
		   System.out.println("Car didn't started");
		}
		
	}
	
}
