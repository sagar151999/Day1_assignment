package neebal_gurukul_day1_assignment;

import java.util.Scanner;

public class check_no_is_armstrong_or_not {

	public static void main(String[] args) {
		int a,b,c,d,z,sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no do you want to check it is armstrong or not");
		z=sc.nextInt();
		 a=z;
		 b=a/100;
		 a=a%100;
		 c=a/10;
		 d=a%10;
		 sum=(b*b*b)+(c*c*c)+(d*d*d);
		 if(z==sum)
		 {
			 System.out.println("the no is armstrong no");
		 }
		 else
		 {
			 System.out.println("the no is not armstrong no");
		 }
		
	}

}
