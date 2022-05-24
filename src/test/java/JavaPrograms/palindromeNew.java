package JavaPrograms;

import java.util.Scanner;

public class palindromeNew {
	
	public static void main(String[] args) {
		int rev = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to be checked fro palindrome");
		int num = sc.nextInt();
		int b = num;
		
		while (b>0) {
			int rem=b%10;
			rev=(rev*10)+rem;
			b=b/10;
		}
		
		if (num==rev) {
			System.out.println("Given number is palindrome");
		}else {
			System.out.println("Given number is not a palindrome");
		}
		sc.close();
	}

}
