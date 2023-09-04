package neebal_gurukul_day1_assignment;

import java.util.Scanner;

public class electricity {

	public static void main(String[] args)
	{
		
		int e,billamount;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the energy consumptions");
		String name=sc.next();
		e=sc.nextInt();
		double amount;
		if(e<=100)
		{
			amount=e*4;
		}
		else if(e>100 && e<=300)
		{
			amount=(100*4)+((e-100)*5);
		}
		else
		{
			amount=((100*4)+(1000)+((e-300)*10));
		}
		System.out.println("enter the name"+name);
		System.out.println("consumption is"+e);
		if(amount<1000)
		{
			System.out.println("amount"+amount);
		}
		else
		{
			amount=amount+((amount*5)/100);
			amount=amount+((amount*18)/100);
			System.out.println("amount"+(amount));	
			}
	}

}
