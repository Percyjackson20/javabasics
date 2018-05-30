package pattern;
import java.util.Scanner;
public class Diamond {
public static void main(String a[])
{
int i=0,j=0,n,s=1;
System.out.println("Number of line");
Scanner sp=new Scanner(System.in);
n=sp.nextInt();
s=n-1;
for(i=1;i<=n;i++)
{
	for(j=1;j<=s;j++)
	{
		System.out.println(" ");
     s--;
	}
	for(j=1;j<=2*i-1;j++) 
	{
	System.out.println("*");
	}
	System.out.println(" ");
}
for(i=1;i<=n-1;i++)
{
for(j=1;j<=s;j++)
{
	System.out.println(" ");
    s++;
}
for(j=1;j<=2*(n-i)-1;j++) 
{
    System.out.println("*");
}
    System.out.println(" ");
}
}
}
