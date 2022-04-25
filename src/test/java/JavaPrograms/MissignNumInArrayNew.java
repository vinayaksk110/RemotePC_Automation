package Jav;

public class MissignNumInArrayNew {
	
	public static void main(String[] args) {
		int arr1[]= {1,2,3,5,6};
		
		int sum1 =0;
		for (int i=0;i<arr1.length;i++) {
			sum1=sum1+arr1[i];
		}
		int sum2=0;
		for(int j=1;j<=6;j++) {
			sum2= sum2+j;
		}
		
		System.out.println("missing number is "+(sum2-sum1));
	}

}
