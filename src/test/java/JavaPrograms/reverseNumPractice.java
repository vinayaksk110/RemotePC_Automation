package JavaPrograms;

import java.util.Scanner;

public class reverseNumPractice {
	public static void main(String[] args) {
		int num,rev=0,r,a;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the number to be reversed :");
		num=s.nextInt();
		a=num;
		while(num>0) {
			r=num%10;
			rev=rev*10+r;
			num=num/10;
		}
	System.out.println("reverse number is : "+rev);	
	s.close();
	
	
	//using Stringbuffer
	long num1 = 123456;
	System.out.println("reverse of "+num1+"is "+new StringBuffer(String.valueOf(num1)).reverse());
	}
}
