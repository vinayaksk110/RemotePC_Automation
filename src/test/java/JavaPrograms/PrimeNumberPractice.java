package JavaPrograms;

import java.util.Scanner;

public class PrimeNumberPractice {
	public static void main(String[] args) {
		int i, num, flag = 0, m;
		Scanner s = new Scanner(System.in);
		System.out.print("enter desired number to find whther it is prime number :");
		num = s.nextInt();
		
		if (num == 0 || num == 1) {
			System.out.println("Entered number is not prime number");
		} else {
			m = num / 2;
			for (i = 2; i <= m; i++) {
				if (num % i == 0) {
					System.out.println("entered number is not a prime number");
					flag = 1;
					break;
				}

			}
			if (flag == 0) {
				System.out.println("entered number is a prime number");
			}
		}
		s.close();
	}

}
