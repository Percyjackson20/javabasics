package com.emp;

public class Student {
String name;
int id;
int mark;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public int setId(int id) {
	this.id = id;
	return id;
}
public int getMark() {
	return mark;
}
public int setMark(int mark) {
	mark+=10;
	this.mark = mark;
	return mark;
}
public static void main(String a[])
{
	Student s1=new Student();
	s1.setName("Elango");
	s1.setId(1);
	s1.setMark(70);
	System.out.println(s1.getName());
	System.out.println(s1.getId());
	System.out.println(s1.getMark());
}
}
