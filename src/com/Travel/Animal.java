package com.Travel;

public abstract class Animal implements Travel{

}
class Cat extends Animal
{
	@Override
	public int getspeed() {
		// TODO Auto-generated method stub
		System.out.println("Cat is called");
		System.out.println(j+10);
		return 0;
	}
}

class Dog extends Animal
{
	@Override
	public int getspeed() {
		// TODO Auto-generated method stub
		System.out.println("Dog is called");
		System.out.println(j+20);
		return 0;
	}
}

class Tiger extends Animal
{
	@Override
	public int getspeed() {
		// TODO Auto-generated method stub
		System.out.println("Tiger is called");
		System.out.println(j+30);
		return 0;
	}
}
