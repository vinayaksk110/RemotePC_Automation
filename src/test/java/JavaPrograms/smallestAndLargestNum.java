package JavaPrograms;

import java.util.Arrays;

public class smallestAndLargestNum {
	
	public static void main(String[] args) {
		
		int num[] = {-10,24,345,-3453,32532};
		
		int largest = num[0];
		int smallest =  num[0];
		
		for (int i =1;i<num.length;i++) {
			if(num[i]>largest) {
				largest=num[i];
			}
			else if(num[i]<smallest) {
				smallest =  num[i];
			}
		}
		
		System.out.println("given array is "+Arrays.toString(num));
		System.out.println("largest number is :"+largest);
		System.out.println("smallest number is :"+smallest);
	}

}
