package JavaPrograms;

import java.util.Scanner;

public class reverseStringNew {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1 = sc.nextLine();
		
		StringRevWithStringBuilder(s1);
		StringReverseWithStringBuffer(s1);
		sc.close();
		
	}
	
	public static void StringRevWithStringBuilder(String s1) {
		
		StringBuilder s2 = new StringBuilder();
		s2= s2.append(s1);
		System.out.println("reverse string using StringBuilder is "+s2.reverse());
	}
	
	public static void StringReverseWithStringBuffer(String s1) {
		StringBuffer s3 = new StringBuffer(s1);
		System.out.println("String reverse using String buffer is "+s3.reverse());
	}

}
