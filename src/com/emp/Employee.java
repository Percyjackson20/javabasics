package com.emp;

public class Employee {

	String Firstname;
	String Secondname;
	double monthlysalary;
	private double yearlysalary;
	public String getFirstname() {
		return Firstname;
	}
	public String setFirstname(String firstname) {
		this.Firstname = firstname;
		return Firstname;
	}
	public String getSecondname() {
		return Secondname;
	}
	public String setSecondname(String secondname) {
		this.Secondname = secondname;
		return Secondname;
	}
	public double getMonthlysalary() {
	
		double i=monthlysalary;
		if(i>0) {
			double salary=12*i;
			 double yearlysalary=(salary/10)+salary;
			return yearlysalary;
			    }
			else
			{
				return 0;
			}
	}
	public double setMonthlysalary(double monthlysalary) {
		this.monthlysalary = monthlysalary;
		return yearlysalary;
	}
	public static void main(String a[])
	{
		Employee e1=new Employee();
		Employee e2=new Employee();
		e1.setFirstname("raj");
		e2.setFirstname("gowtham");
		e1.setSecondname("kumar");
		e2.setSecondname("karthick");
		e1.setMonthlysalary(20000.0);
		e2.setMonthlysalary(25000.0);
		System.out.println(e1.getFirstname());
		System.out.println(e2.getFirstname());
		System.out.println(e1.getSecondname());
		System.out.println(e2.getSecondname());
		System.out.println(e1.getMonthlysalary());
		System.out.println(e2.getMonthlysalary());
	}
}
