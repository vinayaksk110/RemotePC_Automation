package JavaPrograms;

public class SwapTwoStrings {
	public static void main(String[] args) {
		String a = "Hello";
		String b = "Ram";
		
		System.out.println("Before swapping the strings a = "+a+" and b = "+b);
		
		a=a+b;  //Helloworld
		b= a.substring(0,a.length()-b.length());
		a = a.substring(b.length());
		System.out.println("After swapping the strings a = "+a+" and b = "+b);
	}
}
