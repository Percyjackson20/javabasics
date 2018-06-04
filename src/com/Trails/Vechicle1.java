package com.Trails;

public class Vechicle1 implements IOwner{

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String ownerName() {
		// TODO Auto-generated method stub
		return null;
	}
}

class Car extends Animal1
{
	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return j+10;
	}

	@Override
	public String ownerName() {
		// TODO Auto-generated method stub
		return "Car Owner";
	}
}

class Cycle extends Animal1
{
	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return j+20;
	}

	@Override
	public String ownerName() {
		// TODO Auto-generated method stub
		return "Cycle Owner";
	}
}

class Truck extends Animal1
{
	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return j+30;
	}

	@Override
	public String ownerName() {
		// TODO Auto-generated method stub
		return "Truck Owner";
	}
}
