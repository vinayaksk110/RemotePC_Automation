package JavaPrograms;

public class palindrome {
	public static void main(String[] args) {
		int reverse = 0, r, n, temp;
		n = 464;
		temp = n;
		while (temp > 0) {
			r = temp%10;
			reverse = (reverse * 10) + r;
			temp = n / 10;
		}
		if (reverse == n) {
			System.out.println(n + " is a palindrome number");
		} else {
			System.out.println(n + " is not a palindrome number");
		}

	}

}
