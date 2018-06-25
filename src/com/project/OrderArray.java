import java.util.*;
public class OrderArray
{
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int N=sc.nextInt();
	Set<Integer> set=new HashSet<Integer>(N);
	for(int i=0;i<N;i++)
	{
	set.add(sc.nextInt());
	}
	TreeSet sortedSet = new TreeSet<Integer>(set);
	System.out.println(sortedSet);
	}
}
