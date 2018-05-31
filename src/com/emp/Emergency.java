package com.emp;

public class Emergency {
 String name;
 String phonenumber;
 String location;
 String time;
 static String type;
 public String getName() {
	return name;
}

public String setName(String name) {
	this.name = name;
	return name;
}

public String getPhonenumber() {
	return phonenumber;
}

public String setPhonenumber(String phonenumber) {
	this.phonenumber = phonenumber;
	return phonenumber;
}

public String getLocation() {
	return location;
}

public String setLocation(String location) {
	this.location = location;
	return location;
}

public String getTime() {
	return time;
}

public String setTime(String time) {
	this.time = time;
	return time;
}
public static String getType() {
	return type;
}

public static String setType(String type) {
	Emergency.type = type;
	return type;
}

public String solve()
{
	switch(type)
	{
	case "crime":
		return "police";
	case "injury":
	    return "ambulance";
	case "fire":
	    return "fireEngine";
	default:
		return "nothing emergency";
	}
}

public static void main(String a[])
 {
	 Emergency c1=new Emergency();
	 c1.setName("john");
	 c1.setPhonenumber("9685444765");
	 c1.setLocation("t.nagar,chennai");
	 c1.setTime("7.00am");
	 c1.setType("crime");
	 System.out.println(c1.getName());
	 System.out.println(c1.getPhonenumber());
	 System.out.println(c1.getLocation());
	 System.out.println(c1.getTime());
	 System.out.println(c1.getType());
	 System.out.println("solving method "+c1.solve());
	 
 }
}
