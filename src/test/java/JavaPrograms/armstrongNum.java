package JavaPrograms;

import java.util.Scanner;

public class armstrongNum {

	public static void main(String[] args) {
		int arm = 0, a, no, b;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter num to find whether armstrong :");
		no = s.nextInt();
		b = no;
		while (no > 0) {
			a = no % 10;
			no = no / 10;
			arm = arm + a * a * a;
		}
		
		if(arm==b) {
			System.out.println("entered num "+b+" is armstrong num");
		}else {
			System.out.println("Entered no "+b+" is not a armstrong");
		}

	}

}
