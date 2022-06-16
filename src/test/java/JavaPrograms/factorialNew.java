package JavaPrograms;

import java.util.Scanner;

public class factorialNew {
	
	public static void main(String[] args) {
		int a =1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for factorial");
		int no = sc.nextInt();
		
		for(int i=1;i<=no;i++) {
			a = a*i;	
		}
		System.out.println(a);
		
		System.out.println("---------------------*---------------------");
		System.out.println(facto(no));
		
		sc.close();
	}
	
	public static int facto(int num) {
		if(num==0) {
			return 1;
		}
		else {
			return num*facto(num-1);
		}
	}

}
