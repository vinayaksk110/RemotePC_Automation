package JavaPrograms;

import java.util.Arrays;
import java.util.HashSet;

public class tesssss {
	
	public static void main(String[] args) {
		anagram("peek", "keep");
		anagram("ram","Rahim");
		countOfDigitInNumber(11654321);
		duplicateInString("hello world");
		factorial();
		iterables();
		junk();
		reverseS();
		swapnum();
		swapString();
	}
	
	
	public static void anagram(String a, String b) {

		String v1 = a.replaceAll("\\s","");
		String v2 = b.replaceAll("\\s","");
		
		if(v1.length()!=v2.length()) {
			System.out.println("is not anagram");
		}else {
			char ch1[] = v1.toLowerCase().toCharArray();
			char ch2[] = v2.toLowerCase().toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			boolean status = Arrays.equals(ch1,ch2);
			System.out.println(status);
		}
		
		
		
	}
	
	public static void countOfDigitInNumber(int x) {
		int v = x;
		
		int count = 0;
		
		while(v>0) {
			v=v/10;
			count++;
		}
		System.out.println(count);
		
	}
	
	public static void duplicateInString(String s) {
		String s3 = s;
		char a[] = s3.toCharArray();
		
		HashSet<Character> hash= new HashSet<Character>();
		for(char it:a) {
			if(hash.add(it)==false) {
				System.out.print(it);
			}
		}
		System.out.println();
	}

	public static void factorial() {
		int factorial = 5;
		int a=1;
		for(int i=1;i<=factorial;i++) {
			a=a*i;
		}
		System.out.println(a);
	}
	
	public static void iterables() {
		int arr[]= {1,2,3,4,5,6,7,8};
		
		for(int z:arr) {
			System.out.print(z);
		}
		System.out.println();
	}
	
	public static void junk() {
		String st= "FSFwerwq@#!$546534";
		
		String st2 = st.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(st2);
	}

	public static void reverseS() {
		String s1 = "Hello world";
		StringBuffer sb = new StringBuffer(s1);
		System.out.println("reverse using string buffer  :"+sb.reverse());
		
		StringBuilder sbd = new StringBuilder(s1);
		System.out.println("reverse using string builder :"+sbd.reverse());
	}
	
	public static void swapnum() {
		int a=7,b=19;
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a is:"+a+" b is:"+b);
	}
	
	public static void swapString() {
		String c = "Savitri";
		String d= "vinayak";
		
		c=c+d;
		d=c.substring(0,c.length()-d.length());
		c=c.substring(d.length());
		
		System.out.println("c is :"+c+"\nd is :"+d);
	}
	
	public static void sc() {
		
	}
}
