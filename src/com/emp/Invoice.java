package com.emp;


public class Invoice {
String pname;
String pdesc;
int item;
double quantity;
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public String getPdesc() {
	return pdesc;
}
public void setPdesc(String pdesc) {
	this.pdesc = pdesc;
}
public int getItem(int a) {
	if(a>0) 
	{    
	item=a;	
	    return item;}
	else
	{
		return 0;
	}
}
public void setItem(int item) {
	this.item = item;
}
public double getQuantity(double b) {
	if(b>0.0) {
	quantity=b;
	return quantity;}
	else
	{
		return 0.0;
	}
}
public void setQuantity(double quantity) {
	this.quantity = quantity;
}
public double price(int k,double j)
{ if(k>0&&j>0)
    {
	double p=k*j;
	return p;
    }
else if(j>0&&k<0)
{
	return 0.0;
}
else
{
	return 0;
}
}
public static void main(String a[])
{
Invoice s1=new Invoice();
Invoice s2=new Invoice();
int i1=s1.getItem(2);
int i2=s2.getItem(4);
double q1=s1.getQuantity(-500.0);
double q2=s2.getQuantity(400.0);
double d1=s1.price(2,-500.0);
double d2=s2.price(4,400.0);
System.out.println(i1);
System.out.println(i2);
System.out.println(q1);
System.out.println(q2);
System.out.println(d1);
System.out.println(d2);
}
}
