package com.emp;
import java.util.Scanner;
public class Airline {
	boolean aqs[]=new boolean[11];
	Scanner S=new Scanner(System.in);
	public void start()
	{
		while(true) {
	       MakeReservation();
		            }
	}
	public void firstclass()
	        {
			for(int k=1;k<=5;k++)
			{
			if(aqs[k]==false)
			{
				aqs[k]=true;
				System.out.println("successful");
				System.out.println("seat no="+k);
				break;
			}
			else if(aqs[5]==true)
			{   if(aqs[10]==true)
			    {
				System.out.println("flight was full");
				System.out.println("next flight leaves in 3hours");
				System.exit(0);
			    }
			    else
			    {
				System.out.println("firstclass not availale try secondclass");
				System.out.println("if yes type-1 else type-0");
				int count=S.nextInt();
				if(count==1)
				{
					secondclass();
					start();
				}
				else
				{
					System.out.println("next flight leaves in 3hours");
					System.exit(0);
				}
				}
			}
	        }
			}
		public void secondclass() {
			for(int k=6;k<=10;k++)
			{
			    if(aqs[k]==false)
			    {
				 aqs[k]=true;
				System.out.println("successful");
				System.out.println("seat no="+k);
				break;
				}
			    else if(aqs[10]==true)
				{   if(aqs[5]==true)
				    {
					System.out.println("flight was full");
					System.out.println("next flight leaves in 3hours");
					System.exit(0);
				    }
				    else
				    {
					System.out.println("firstclass not availale try secondclass");
					System.out.println("if yes type-1 else type-0");
					int count=S.nextInt();
					if(count==1)
					{
						firstclass();
						start();
					}
					else
					{
						System.out.println("next flight leaves in 3hours");
						System.exit(0);
					}
					}
				}
			}
			
		                           }
	public void MakeReservation()
	{
	   System.out.println("first class type-1 or second class type-2");
	   int type=S.nextInt();
	   if(type==1)
	   {   
		   firstclass();
	   }
	   else if(type==2)
	   {
		   secondclass();
	   }
	   
	}
public static void main(String a[])
{
	Airline t=new Airline();
	t.start();
	t.MakeReservation();
}
}
