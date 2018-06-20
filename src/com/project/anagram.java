import java.util.*;
public class anagram
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s1=sc.next().toUpperCase();
String s2=sc.next().toUpperCase();
char[] c1=s1.toCharArray();
char[] c2=s2.toCharArray();
Arrays.sort(c1);
Arrays.sort(c2);
String s3=new String(c1);
String s4=new String(c2);
if(s4.equals(s3))
{
System.out.println("ANAGRAM");
}
else
{
System.out.println("NOT ANAGRAM");
}
}
}