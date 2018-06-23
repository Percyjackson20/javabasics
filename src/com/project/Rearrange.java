import java.util.*;
public class Rearrange
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int a[]=new int[N];
for(int j=0;j<a.length;j++)
{
a[j]=sc.nextInt();
}
for(int i=N-1;i>0;i--)
{
if(i%2==0)
{
if(a[i]>=a[i-1])
{
int n=0;
n=a[i-1];
a[i-1]=a[i];
a[i]=n;
}
}
else
{
if(a[i]<=a[i-1])
{
int n=0;
n=a[i-1];
a[i-1]=a[i];
a[i]=n;
}
}
}
for(int k=0;k<a.length;k++)
{
System.out.print(a[k]+" ");
}
}
}
