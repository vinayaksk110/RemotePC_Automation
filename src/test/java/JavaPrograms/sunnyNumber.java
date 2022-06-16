package JavaPrograms;

import java.util.Scanner;

public class sunnyNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int N = sc.nextInt();
		isSunnnyNo(N);
		
	}
	static boolean perfectSqr(double num) {
		double sqrt = Math.sqrt(num);
		return((sqrt-Math.floor(sqrt))==0);
		
	}
	static void isSunnnyNo(int N) {
		if(perfectSqr(N+1)) {
			System.out.println(N+" is a sunny number");
		}else {
			System.out.println(N+" is not a sunny number");
		}
	}

}
