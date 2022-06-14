package JavaPrograms;

import java.util.Arrays;
import java.util.HashSet;

public class ProgPRact {
	
	
	public static void main(String[] args) {
		ProgPRact pr = new ProgPRact();
		pr.anagram("race","care");
		pr.anagram("part","trap");
		swapString();
		largestnumber();
		duplicatesInArray();
		pr.duplicateinHashset();
		IterateThroughArrays();
	}

	public void anagram(String str1, String str2) {
		boolean status;
		String st1 =str1;
		String st2 = str2;
		
		st1 = st1.replaceAll("\\s", "");
		st2 = st2.replaceAll("\\s", "");
		if(st1.length()!=st2.length()){
			status = false;
		}
		
		char[] arr1 = st1.toLowerCase().toCharArray();
		char[] arr2 = st2.toLowerCase().toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		status = Arrays.equals(arr1, arr2);
		
		if(status) {
			System.out.println("Anagram chars: "+ str1 +", " +str2);
		}else {
			System.out.println("not anagram chars: "+ str1 +", " +str2);
		}
		
	}
	
	public static void swapString() {
		String a= "Dilipss";
		String b= "Kumara";
		
		a =a+b;
		b=a.substring(0, (a.length()-b.length()));
		a=a.substring(b.length());
		System.out.println(a+", "+b);
	}
	
	public static void largestnumber() {
		int largest =0;
		int[] a = {20, -34, 45, 678, 1,0};
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>largest) {
				largest=a[i];
			}
		}
		System.out.println(largest);
	}
	
	public static void duplicatesInArray() {
		String[] arrdup = {"java", "c++","random","rd","sugar","c++","java","c#","c#","gh"};
		
		for(int i =0;i<arrdup.length;i++) {
			for(int j = i+1;j<arrdup.length;j++) {
				if(arrdup[i].equals(arrdup[j])) {
					System.out.print(arrdup[i]+", ");
				}
			}
		}
		System.out.println();
	}
	
	public void duplicateinHashset() {
		String[] arrdup = {"java", "c++","random","rd","sugar","c++","java","c#","c#","gh"};
		
		HashSet<String> set = new HashSet<String>();
		for(String forHash:arrdup) {
			if(set.add(forHash)==false) {
				System.out.print(forHash+", ");
			}
		}
	}
	
	public static void IterateThroughArrays() {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		System.out.println();
		for(int i =0; i<arr.length;i++) {
			System.out.print(arr[i]+", ");
		}
	}

}
