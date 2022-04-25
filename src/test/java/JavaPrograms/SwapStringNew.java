package JavaPrograms;

public class SwapStringNew {
	
	public static void main(String[] args) {
		String a = "Hello";
		String b ="Vinayak";
		
		a= a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println("a is "+a+" and b is "+b);
	}

}
