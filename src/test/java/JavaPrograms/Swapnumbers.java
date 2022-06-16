package JavaPrograms;

import java.util.Scanner;

public class Swapnumbers {
	public static void main(String[] args) {
//		int a,b;
//		Scanner s = new Scanner(System.in);
//		System.out.println("enter 1st number a :");
//		a=s.nextInt();
//		System.out.println("Enter 2nd number b :");
//		b=s.nextInt();
		int a=6,b=9;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("value of a is :"+a);
		System.out.println("value of b is :"+b);
		
		System.out.println("*****************************************");
		int c = 10 ,d =7;
		c=c*d;
		d=c/d;
		c=c/d;
		System.out.println("value of c is :"+c);
		System.out.println("value of d is :"+d);
	}

}
