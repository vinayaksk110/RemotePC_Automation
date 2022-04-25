package JavaPrograms;

import java.util.Scanner;

public class countOFDigitInNumberNew {
	
	public static void main(String[] args) {
		int a=0, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the desired number");
		int num1  = sc.nextInt();
		b = num1;
		
		while(b>0) {
			b= b/10;
			a++;
		}
		System.out.println("number of digits in given number is :"+a);
		sc.close();
	}

}
