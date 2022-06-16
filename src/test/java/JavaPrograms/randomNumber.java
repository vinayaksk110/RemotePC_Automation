package JavaPrograms;

public class randomNumber {
	public static void main(String[] args) {
		System.out.println("random number is "+Math.random());
		
		
		int min=200;
		int max=400;
		//random number in int
		int b=(int)(Math.random()*(max-min+1)+min);
		System.out.println("integer random number is "+b);
		
		//random number in double
		double d=Math.random()*(max-min+1)+min;
		System.out.println(d);
	}

}
