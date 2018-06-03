package com.Travel;

public abstract class Vehicle implements Travel{


}

class Car extends Vehicle
{
	@Override
	public int getspeed() {
		// TODO Auto-generated method stub
		System.out.println("Car is called");
		System.out.println(i+10);
		return 0;
	}
}

class Cycle extends Vehicle
{
	@Override
	public int getspeed() {
		// TODO Auto-generated method stub
		System.out.println("Cycle is called");
		System.out.println(i+20);
		return 0;
	}
}

class Track extends Vehicle
{
	@Override
	public int getspeed() {
		// TODO Auto-generated method stub
		System.out.println("Track is called");
		System.out.println(i+30);
		return 0;
	}
}