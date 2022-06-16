package JavaPrograms;

public class factorialRecursive {
	
	public static void main(String[] args) {
		System.out.println(facto(5));
	}
	
	public static int facto(int num) {
		if(num==0) {
			return 1;
		}
		
		else 
			return num*facto(num-1);
	}

}
