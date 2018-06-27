import java.util.*;
public class PossibleWords
{
public static void main(String args[])
{
String s1=args[0];
String s2=args[1].toUpperCase();
identifyPossibleWords(s1,s2);
}
public static void identifyPossibleWords(String input1,String input2)
{
    String s1="";
input1=input1.toUpperCase();
String s[]=input2.split(":");
for(int i=0;i<s.length;i++)
{
int c=0;
if(input1.length()==s[i].length())
{
for(int j=0;j<s[i].length();j++)
{
if(input1.charAt(j)==s[i].charAt(j))
{
c++;
}
}
if(c==(input1.length()-1))
{
s1+=s[i];
s1+=":";
}
}
}

if(s1=="")
{
System.out.println("ERROR");
}
else
{
for(int i=0;i<s1.length()-1;i++)
{
System.out.print(s1.charAt(i));
}
}
}
}

