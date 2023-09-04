package neebal_gurukul_day1_assignment;

import java.util.Scanner;

public class reverse_of_two_numbers {

	public static void main(String[] args) {
		int num,num1,num2;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no");
		num=sc.nextInt();
		num1=num%100;
		num2=num/100;
		System.out.println(num1*100+num2);

	}

}
