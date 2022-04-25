package Jav;

public class Pattern {
	
	public static void main(String[] args) {
		star1();
	}
	
	public static void star1() {
		int row=5;
		for(int i=0;i<row;i++) {
			for(int j=i;j<row;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
