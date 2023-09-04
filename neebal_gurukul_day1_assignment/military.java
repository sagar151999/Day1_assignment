package neebal_gurukul_day1_assignment;

import java.util.Scanner;

public class military {

	public static void main(String[] args) {
		int code,min,hour;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the military code");
		code = sc.nextInt();
		hour = code/100;
		hour =hour %12;
		min = code%100;
		min =min%60;
		System.out.println(hour+":"+min);

	}

}
