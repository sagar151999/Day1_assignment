package neebal_gurukul_day1_assignment;

import java.util.Scanner;

public class converting_secs_mili_miniutes {

	public static void main(String[] args)
	{
		int time,second,minute,hour;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the time");
		time=sc.nextInt();
		
		 second=time/1000;
		 minute=second/60;
		 hour=minute/60;
		
		second=second%60;
		minute=minute%60;
		System.out.println(hour+":"+minute+":"+second);
		

	}

}
