import java.util.*;
public class AnagramStr
{
public static void main(String args[])
{
int b=0,d=0;
char n='"';
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String s1=sc.nextLine();
char c[]=s.toCharArray();
char c1[]=s1.toCharArray();
Arrays.sort(c);
Arrays.sort(c1);
String s2=new String(c);
String s3=new String(c1);
try {
for(int i=0;i<c.length;i++)
{
for(char m='A';m<='Z';m++)
{
if(s2.charAt(i)==m)
{
b++;
}
if(s3.charAt(i)==m)
{
d++;
}
}
}
for(int j=0;j<c1.length;j++)
{
for(char m1='a';m1<='z';m1++)
{
if(s2.charAt(j)==m1)
{
b++;
}
if(s3.charAt(j)==m1)
{
d++;
}
}
}
if(b==c.length&&d==c1.length)
{
if(s2.equals(s3))
{
System.out.println("true");
}
else
{
System.out.println("false");
}
}
else
{
System.out.println(n+"Invalid String"+n);
}
}
catch(StringIndexOutOfBoundsException e) {
    if(b!=c.length&&d!=c1.length)
    {
    System.out.println(n+"Invalid String"+n);  
    }
    else
    {
    System.out.println("false");
    }
} 
}
}
