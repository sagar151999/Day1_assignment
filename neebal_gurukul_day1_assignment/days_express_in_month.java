package neebal_gurukul_day1_assignment;

import java.util.Scanner;

public class days_express_in_month {

	public static void main(String[] args)
	{
		int year,days,month,week,day;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the days");
		days=sc.nextInt();
		 year=days/365;
		 month=(days%365)/30;
		 week=((days%365)%30)/7;
		 days=(((days%365)%30)%7);
		System.out.println(year+" years:"+month+" month:"+week+" week:"+days+" days");
		
	}

}
