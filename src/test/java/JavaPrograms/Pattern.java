package JavaPrograms;

public class Pattern {
	
	public static void main(String[] args) {
		star1();
		star2();
	}
	
	public static void star1() {
//		*****
//		****
//		***
//		**
//		*
		int row=5;
		for(int i=0;i<row;i++) {
			for(int j=i;j<row;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void star2() {
		int row=5;
		for(int i=0;i<=row;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
