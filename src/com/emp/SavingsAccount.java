package com.emp;

public class SavingsAccount {
static double rate;
private static double balance;
public static double getRate() {
	return rate;
}

public static double setRate(double rate) {
	SavingsAccount.rate = rate/100;
	return rate;
}

public double getBalance() {
	return balance;
}

public double setBalance(double balance) {
	this.balance = balance;
	return balance;
}

public static double modifyinterest()
{    double e=balance;
	double b1=(balance*(rate/12));
	double b2=e+b1;
	return b2;
}
public static void main(String args[])
{
	SavingsAccount b=new SavingsAccount();
	SavingsAccount c=new SavingsAccount();
	b.setRate(4.0);
	System.out.println("rate"+b.getRate());
	b.setBalance(2000.0);
	System.out.println(b.modifyinterest());
	c.setRate(4.0);
	System.out.println("rate"+c.getRate());
	c.setBalance(3000.0);
	System.out.println(c.modifyinterest());
	b.setRate(5.0);
	System.out.println("rate"+b.getRate());
	b.setBalance(2000.0);
	System.out.println(b.modifyinterest());
	c.setRate(5.0);
	System.out.println("rate"+c.getRate());
	c.setBalance(3000.0);
	System.out.println(c.modifyinterest());
}
}
