import java.util.*;


public class Minimax

{


static int N=0;

public static void main(String args[])


{


Scanner sc=new Scanner(System.in);


N=sc.nextInt();


int a[]=new int[N]; 

for(int i=0;i<N;i++)


{


a[i]=sc.nextInt();


}


Find(a);


}


public static void Find(int[] a)


{

int m1=Integer.MIN_VALUE;
    
int m2=Integer.MIN_VALUE;

for(int n:a)

{

  if(m1<n)
  
  {

      m2=m1;
   
      m1=n;

  }
 
 else if(m2<n&&m1!=n)
 
  {

      m2=n;

  }

}

System.out.println(m1+" "+m2);

}

}