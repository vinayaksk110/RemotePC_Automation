package JavaPrograms;

import java.util.Scanner;

public class fibonacciPractice {
	
	public static void main(String[] args) {
		int a=0,b=1,c,lim;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the until where fib should be checked : ");
		lim=s.nextInt();
		System.out.print(a+" "+b);
		for(int i=2;i<lim;i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}

}
