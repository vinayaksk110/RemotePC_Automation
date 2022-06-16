package JavaPrograms;

import java.util.Scanner;

public class OddEvenNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the desired number :");
		int no = s.nextInt();
		if(no%2==0) {
			System.out.println(no+" is a even number");
		}else {
			System.out.println(no+" is a odd number");
		}
		
	}

}
