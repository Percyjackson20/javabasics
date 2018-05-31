package com.emp;


public class Invoice {
String pname;
String pdesc;
int item;
double quantity;
public String getPname() {
	return pname;
}
public String setPname(String pname) {
	this.pname = pname;
	return pname;
}
public String getPdesc() {
	return pdesc;
}
public void setPdesc(String pdesc) {
	this.pdesc = pdesc;
}
public int getItem() {
	if(item>0) 
	{    
	    return item;
	}
	else
	{
		return 0;
	}
}
public int setItem(int item) {
	this.item = item;
	return item;
}
public double getQuantity() {
	if(quantity>0.0)
	{
	return quantity;
	}
	else
	{
		return 0.0;
	}
}
public double setQuantity(double quantity) {
	this.quantity = quantity;
	return quantity;
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
s1.setPname("ball");
s2.setPname("chocolate");
s1.setItem(2);
s2.setItem(4);
s1.setQuantity(-500.0);
s2.setQuantity(400.0);
double d1=s1.price(2,-500.0);
double d2=s2.price(4,400.0);
System.out.println(s1.getPname());
System.out.println(s2.getPname());
System.out.println(s1.getItem());
System.out.println(s2.getItem());
System.out.println(s1.getQuantity());
System.out.println(s2.getQuantity());
System.out.println(d1);
System.out.println(d2);
}
}
