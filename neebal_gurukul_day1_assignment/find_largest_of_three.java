/*
 * Input 3 numbers and find the largest.
Input: 7
3
5
Output: 7
Condition : your program cannot have more than 2 comparisons
 */



package neebal_gurukul_day1_assignment;

import java.util.Scanner;

public class find_largest_of_three {

	public static void main(String[] args) 
	{
		int num,num1,num2,num3;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the three no");
		num=sc.nextInt();
		num1=sc.nextInt();
		num2=sc.nextInt();
		int n=num>num1?num:num1;
		num2=n>num2?n:num2;
		System.out.println(num2);
	}

}
