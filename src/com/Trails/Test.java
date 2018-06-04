package com.Trails;

public class Test {
  public static void Display(IOwner owner)
  {
	  
	  System.out.println(owner.ownerName());
	  System.out.println(owner.getSpeed());
	 
  }
	public static void main(String[] args) {
		IOwner car=new Car();
		IOwner cycle=new Cycle();
		IOwner truck=new Truck();
		IOwner cat=new Cat();
		IOwner dog=new Dog();
		IOwner tiger=new Tiger();
		
		Display(car);
		Display(cycle);
		Display(truck);
		Display(cat);
		Display(dog);
		Display(tiger);
	}
}
