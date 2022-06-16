package JavaPrograms;

import java.util.Scanner;

public class digitsInGivenNum {
	public static void main(String[] args) {
		int no,a=0,b;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter num to find whether armstrong :");
		no = s.nextInt();
		b=no;
		
		while(no>0) {
			no=no/10;
			a++;
		}
		System.out.println("no of digits in "+ b + " is "+a);
	}

}
