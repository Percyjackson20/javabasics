import java.util.*;
public class EvenSum
{
	public static void main(String[] args) {
	EvenSum m=new EvenSum();
	Scanner sc=new Scanner(System.in);
	System.out.println(m.EvenDigitSum(sc.nextInt()));
	}
	public int EvenDigitSum(int input1)
	{
	int t=0;
	char s[]=String.valueOf(input1).toCharArray();
	for(int i=0;i<s.length;i++)
	{
	if(Integer.parseInt(String.valueOf(s[i]))%2==0)
	{
	t+=Integer.parseInt(String.valueOf(s[i]));
	}
	}
	return t;
	}
}
