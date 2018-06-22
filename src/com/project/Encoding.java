import java.util.*;
public class Encoding
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    String s[]=sc.nextLine().split("\\s");
    int a[]=new int[s.length];
    for(int i=0;i<a.length;i++)
    {
    a[i]=Integer.valueOf(s[i]);
    }
    findOriginalFirstAndSum(a);
    }
    public static void findOriginalFirstAndSum(int[] input1)
    {
        int b[]=new int[input1.length];
        System.out.print("Encoded array={");
        for(int i=0;i<input1.length;i++)
        {
        if(i<input1.length-1)
        {
        input1[i]=input1[i+1]-input1[i];
        System.out.print(input1[i]+",");
        }
        else
        {
        input1[i]=input1[i];
        System.out.print(input1[i]);
        }
        }
        System.out.println("}");
        int c=input1[(input1.length)-1];
        b[input1.length-1]=input1[input1.length-1];
        int sum=c;
       for(int j=input1.length-2;j>=0;j--)
       {
           //System.out.println(c);
           c=c-input1[j];
           sum+=c;
           b[j]=c;
       }
       System.out.println("First number in original array="+b[0]);
       System.out.println("Sum of all numbers in original array="+sum);
    }
}
