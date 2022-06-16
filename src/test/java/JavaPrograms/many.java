package JavaPrograms;

import java.util.Scanner;

public class many {

	public static void main(String[] args) {
//		new many().armStrongMethod();
//		new many().reverseNum();
//		new many().oddEven();
//		new many().swapNumbers();
//		new many().primeNumber();
//		new many().factorialNumber();
//		new many().fibonacci();
//		new many().palindromeNum();
//		new many().numOfWords();
//		new many().reverseString();
//		new many().countCharOccurance();
//		new many().randomNum();
//		new many().asciiValueProg();
//		System.out.println(isAtomorphic(82) ? "Automorphic" : "Non automorphic");
//		System.out.println(isAtomorphic(76) ? "Automorphic" : "Non automorphic");
//		new many().fascinatingNum();
//		new many().noOfcharsInString();
//		new many().noOfVowelsInString();
		
	}

	public void armStrongMethod() {
		System.out.println("method to check armstrong number");
		int i, j, k, arm = 0;
		i = 153;
		j = i;
		while (i > 0) {
			k = i % 10;
			i = i / 10;
			arm = arm + k * k * k;
		}
		if (j == arm) {
			System.out.println("entered number " + j + " is armstrong number");
		} else {
			System.out.println("entered number " + j + " is not a armstrong number");
		}

	}
	
	public void reverseNum() {
		int i1, k, num, rev = 0;
		num = 145;
		i1 = num;
		while (i1 > 0) {
			k = i1 % 10;
			i1 = i1 / 10;
			rev = rev*10 + k;

		}
		System.out.println("reverse of number " + num + " is " + rev);
	}
	
	public void oddEven() {
		int i;
		i = 25;
		if(i%2==0) {
			System.out.println(i+" is even number");
		}else {
			System.out.println(i+" is odd number");
		}
		
	}
	
	public void swapNumbers() {
		int a=10,b=7;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("swapped numbers are a="+a+", b="+b );
	}
	
	public void primeNumber() {
		int i,no=31;
		if(no==1) {
			System.out.println("smallest prime number is 2");
		}
		for(i=2;i<no;i++) {
			if(no%i==0){
				System.out.println(no+" is not a prime number");
				break;
			}	
		}
		if(no==i) {
			System.out.println(no+" is a prime number");
		}
			
	}

	public void factorialNumber() {
		int i,no=5,fact=1;
		for(i=1;i<=no;i++) {
			fact=fact*i;
		}
		System.out.println("factorial of "+no+" is = "+fact);
	}
	
	public void fibonacci() {
		int first=0,second=1,limit,next = 0;
		limit = 10;
		System.out.print(first+" , "+second);
		for (int i=2;i<limit;i++) {
			next=first+second;
			first = second;
			second = next;
			System.out.print(" , "+next);
		}
		
	}

	public void palindromeNum() {
		int i1, k, num, rev = 0;
		num = 1991;
		i1 = num;
		while (i1 > 0) {
			k = i1 % 10;
			i1 = i1 / 10;
			rev = rev*10 + k;

		}
		if(rev == num) {
			System.out.println(num+ " is Palindrome number");
		}
		else{
			System.out.println(num+ " is not Palindrome number");
		}
	}

	public void numOfWords() {
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count =1;
		for(int i=0;i<s.length()-1;i++) {
			if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' ')){
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
	
	public void reverseString() {
		System.out.println("Enter the string to be reversed :");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringBuffer rev= new StringBuffer(s);
		System.out.println("reverse of string "+s+ " is = "+rev.reverse());
		sc.close();
	}

	public void countCharOccurance() {
		System.out.println("Enter the string to find the word and occurance");
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		s= s.toLowerCase();
		int count = s.length() - s.replace("t", "").length();
		System.out.println(count);
		sc.close();
	}

	public void randomNum() {
		System.out.println("random number is "+Math.random());	
	}
	
	public void asciiValueProg() {
		char ch = 'd';
		char ch2 = 'D';
		int ascii= ch;
		int ascii2=ch2;
		System.out.println("ASCII of given number is "+ascii);
		System.out.println("ASCII of given number is "+ascii2);
	
	}
	
	static boolean isAtomorphic(int num) {
		int sq = num * num;
		while (num > 0) {
			if ((num % 10) != (sq % 10)) {
				return false;
			}
			num = num / 10;
			sq = sq / 10;
		}
		return true;
	}
	
	public void fascinatingNum() {
		int num,num2,num3;
		num = 192;   // 192 219 273 327 1902 1920 2019 2190 2703 2730 3027 3270 are some fascinating num
		num2 = num*2;
		num3 = num*3;
		String concatString = num+""+num2+""+num3;
		System.out.println(concatString);
		boolean found = true;
		for(char c='1';c<'9';c++) {
			int count =0;
			for(int i=0;i<concatString.length();i++) {
				char ch = concatString.charAt(i);
				if(ch==c) {
					count++;
				}
			}
			if(count>1 || count == 0) {
				found = false;
				break;
			}
		}
		if(found) {
			System.out.println(num+" is fascinating num");
		}else {
			System.out.println(num+" is not a fascinating num");
		}
	
	}

	public void noOfcharsInString() {
		String str = "the world has 2";
		int count = 0;
		for (int i=0; i<str.length();i++) {
			if(str.charAt(i)!= ' ') {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public void noOfVowelsInString() {
		String str = "aeiou";
		str = str.toLowerCase();
		int count = 0;
		for (int i=0; i<str.length();i++) {
			if(str.charAt(i)== 'a'||str.charAt(i)== 'e'||str.charAt(i)== 'i'||str.charAt(i)== 'o'||str.charAt(i)== 'u') {
				count++;
			}
		}
		System.out.println(count);
	}
}
