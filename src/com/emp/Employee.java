package com.emp;

public class Employee {

	String Firstname;
	String Secondname;
	double monthlysalary;
	public String getFirstname(String a) {
		Firstname="Firstname is "+a;
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getSecondname(String b) {
		Secondname="Secondname is "+b;
		return Secondname;
	}
	public void setSecondname(String secondname) {
		Secondname = secondname;
	}
	public double getMonthlysalary(double i) {
		if(i>0) {
		double salary=12*i;
		 double sal=salary;
		 double yearly=(salary/10)+sal;
		double yearlysalary=yearly;
		return yearlysalary;
		    }
		else
		{
			return 0;
		}
		
	}
	public void setMonthlysalary(double monthlysalary) {
		this.monthlysalary = monthlysalary;
	}
	public static void main(String a[])
	{
		Employee e1=new Employee();
		Employee e2=new Employee();
		String f1=e1.getFirstname("raj");
		String f2=e2.getFirstname("gowtham");
		String s1=e1.getSecondname("kumar");
		String s2=e2.getSecondname("karthick");
		double m1=e1.getMonthlysalary(20000.0);
		double m2=e2.getMonthlysalary(25000.0);
		System.out.println(f1);
		System.out.println(s1);
		System.out.println(m1);
		System.out.println(f2);
		System.out.println(s2);
		System.out.println(m2);
	}
}
