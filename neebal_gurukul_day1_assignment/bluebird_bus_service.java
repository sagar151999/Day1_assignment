/*
 Bluebird bus service operates abusonly when its entire 50seats are occupied. X
 numberof bookings have beenmade fortheday. Find thenumber of people fromXwho
will gettotravel today.
Case 1:
Input : X= 109
Output:PeopleTravelling=100 
Case 2:
Input :X = 49
Output : People Travelling = 0
Hint : No.of passengers travelling = 50 * (x//50
 */
package neebal_gurukul_day1_assignment;

import java.util.Scanner;

public class bluebird_bus_service {

	public static void main(String[] args) 
	{
		int a,peopletraveling;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of passengers are traveling");
		a=sc.nextInt();
		peopletraveling=50*(a/50);
		
		System.out.println("total people travelling = "+peopletraveling);
		

	}

}
