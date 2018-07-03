import java.util.*;
public class possiblePalindrome
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next().toUpperCase();
	int c=0;
	for(int i=0;i<s.length();i++)
	{
	for(int j=0;j<s.length();j++)
	{
	if(i!=j)
	{
	if(Character.isLetter(s.charAt(i)))
	{
	if(s.charAt(i)==s.charAt(j))
	{
	c++;
	}
	}
	}
	}
	}
	if(c==s.length())
	{
	System.out.println(c);
	}
	else if(c<s.length())
	{
	if(c==0)
	{
	System.out.println(-1);
	}
	else
	{
	c=c+1;
	System.out.println(c);
	}
	}
	
	}
}
