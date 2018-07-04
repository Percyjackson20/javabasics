import java.util.*;
public class CreatePin
{
public static void main(String[] args)
{
String s="",l="",s1="";
int left=0,right=0;
Scanner sc=new Scanner(System.in);
String fn=sc.next();
String ln=sc.next();
String f1=fn.toUpperCase();
String l1=ln.toUpperCase();
String p=String.valueOf(sc.nextInt());;
String p1=new StringBuilder(p).reverse().toString();
int n=sc.nextInt();
if(fn.length()<=ln.length())
{
if(fn.length()!=ln.length())
{
s=fn;
l=ln;
}
else
{
for(int i=0;i<f1.length();i++)
{
int j=f1.charAt(i)-l1.charAt(i);
if(j==0)
{
continue;
}
else if(j<0)
{
s=fn;
l=ln;
break;
}
else
{
s=ln;
l=fn;
break;
}
}
}
}
else
{
s=ln;
l=fn;
}
for(int i=0;i<n;i++)
{
left=Integer.parseInt(String.valueOf(p.charAt(i)));
right=Integer.parseInt(String.valueOf(p1.charAt(i)));
}
if(fn.length()==n||ln.length()==n)
{
System.out.println("ERROR");
}
else
{
String f=s.charAt(s.length()-1)+l+left+right;
for(int i=0;i<f.length();i++)
{
if(Character.isLowerCase(f.charAt(i)))
{
s1+=Character.toUpperCase(f.charAt(i));
}
else
{
s1+=Character.toLowerCase(f.charAt(i));
}
}
System.out.println(s1);
}
}
}
