package com.project;
import java.util.*;
public class MainM {
public static void identifyPossibleWords(String input1, String input2)
{
int l3=input2.length();
int f=0;
String as=" ";
String q[]=new String[l3];
String input=input1.toUpperCase();
String s[]=input2.split(":");
String temp=null;
int l=s.length;
int c=0,j=0,i=0,k=0;
int l1=input1.length();
int a[]=new int[l];
for(i=0;i<l;i++)
{
s[i]=s[i].toUpperCase();
//System.out.println(s[i]);
a[i]=s[i].length();
}
for(j=0;j<l;j++)
{
if(l1==a[j])
{
q[j]=s[j];
c=0;
for(k=0;k<q[j].length();k++)
{
if(q[j].charAt(k)==input.charAt(k))
{
c=c+1;
}
}
if(c==(l1-1))
{
as+=q[j];
as+=":";
}
}
}
for(int n=1;n<as.length()-1;n++)
{
System.out.print(as.charAt(n));
}
if(as==" ")
{
System.out.println("ERROR-009");
}
}
public static void main(String[] args) {
MainM m=new MainM();
MainM m1=new MainM();
MainM m2=new MainM();
m.identifyPossibleWords("Fi_er","Fever:filter:Filer:Fixer:fiber:fibre:tailor:offer");
System.out.println("\n");
m1.identifyPossibleWords("t_xer","Thank:Time:tiger:trial:fixer:final:Alpha:tiler:Tiles:tider");
System.out.println("\n");
m2.identifyPossibleWords("thi_","Thin:That:Those:this:what:Thip:why:Whap:than:THAR:thick");
}
}



