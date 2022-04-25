package JavaPrograms;

import java.util.Scanner;

public class ConvertIntToStringNew {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int a = sc.nextInt();
		System.out.println("Enter 2nd integer");
		int b = sc.nextInt();
		
		System.out.println("Converting 1st int to string :"+Integer.toString(a));
		System.out.println("Converting 2nd int to string :"+Integer.toString(b));
		
		sc.close();
		
	}

}
