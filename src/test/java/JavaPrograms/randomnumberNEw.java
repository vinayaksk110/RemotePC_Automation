package JavaPrograms;

public class randomnumberNEw {
	public static void main(String[] args) {
		System.out.println(Math.random());
		
		int a=200;
		int b = 400;
		
		//remove the unwanted merge
		int ran = (int)(Math.random()*((b-a)+1)+a);
		System.out.println(ran);

	}

}
