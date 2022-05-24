package JavaPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ProgramsPract {


	public static void anagramP() {

		String Str3 = "Mother In Law";
		String Str4 = "Hitler Woman";

		String s3 = Str3.replaceAll("\\s", "");
		String s4 = Str4.replaceAll("\\s", "");

		char[] Arrays3 = s3.toLowerCase().toCharArray();
		char[] Arrays4 = s4.toLowerCase().toCharArray();

		Arrays.sort(Arrays3);
		Arrays.sort(Arrays4);

		boolean status = Arrays.equals(Arrays3, Arrays4);
		if (status) {
			System.out.println("arrays are anagram");
		} else {
			System.out.println("arrays are not anagram");
		}
	}

	public static void AScii() {
		int asc1 = 'v';
		int asc2 = 'k';

		System.out.println(asc1 + " , " + asc2);
	}

	public static void intToString() {
		int a = 56;
		int b = 26;

		System.out.println(Integer.toString(a) + " , " + Integer.toString(b));
	}

	public static void numOfIntInDigit() {
		int a1 = 0, b = 20526, c;
		c = b;

		while (c > 0) {
			c = c / 10;
			a1++;
		}
		System.out.println(a1);

	}

	public static void duplicateInArray() {

		String[] arr1 = { "java", "python", "java", "eclipse", "c++", "c#", "c#" };
		HashSet<String> store = new HashSet<String>();

		for (String storeset : arr1) {
			if (store.add(storeset) == false) {
				System.out.print(", " + storeset);
			}
		}
		System.out.println();
	}

	public static void duplicateInArray1() {

		String[] arr2 = { "java", "python", "java", "eclipse", "c++", "c#", "c#" };

		for (int i = 0; i < arr2.length; i++) {
			for (int j = i + 1; j < arr2.length; j++) {
				if (arr2[i].equals(arr2[j])) {
					System.out.print(" " + arr2[i]);
				}
			}
		}System.out.println();
	}
	
	public static void hasshMapp() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("karnataka", "bengaluru");
		map.put("Maharashtra", "Mumbai");
		System.out.println(map.get("karnataka"));
		map.clear();
	}
	
	public static void hassSet() {
		HashSet<String> set = new HashSet<String>();
		set.add("gulbarga");
		set.add("Golkonda");
		System.out.println(set.contains("bengaluru"));
	}
	
	public static void facto() {
		int num =5;
		int aF =1;
		
		for(int i=1;i<=num;i++) {
			aF = aF*i;
		}
		System.out.println(aF);
	}
	
	public static void fibon() {
		int limit = 7,c;
		int a = 0;
		int b = 1;
		System.out.print(a+", "+b);
		for(int i =2; i<limit;i++) {
			c = a+b;
			System.out.print(", "+c);
			a=b;
			b=c;
		}
		System.out.println();
	}
	
	public static void missingNumInArr() {
		int[] arrInt= {1,2,3,5,6};
		int sum1=0,sum2 = 0;
		
		for(int i=0;i<arrInt.length;i++) {
			sum1 = sum1+arrInt[i];
		}
		
		for(int j=1;j<=6;j++) {
			sum2 = sum2+j;
		}
		
		System.out.println(sum2-sum1);
	}
	
	
	public void removeJunk() {
		String St= "@!#$##Testing12%^$#$%";
		
		String Strreplace = St.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(Strreplace);
	}
	
	public void StringRev1usingBuilder() {
		String st5 = "Vinayak";
		
		StringBuilder stb = new StringBuilder();
		stb= stb.append(st5);
		stb.reverse();
		System.out.println(stb);
	}
	
	public void StringRevUsingStringBuffer() {
		String st6 = "Savitri";
		
		StringBuffer stbfr = new StringBuffer(st6);
		stbfr.reverse();
		System.out.println(stbfr);
		
	}
	
	public void superClassOfJavaprogram() {
		ProgramsPract pract1 = new ProgramsPract();
		Class cls = pract1.getClass().getSuperclass();
		System.out.println(cls);
	}
	
	public static void swapNu() {
		int a1=7;
		int b1=9;
		
		a1=a1+b1;
		b1=a1-b1;
		a1=a1-b1;
		
		System.out.println(a1+""+b1);
	}
	
	public static void SwapString() {
		String stm1 = "Automation";
		String stm2 = "Testing";
		
		stm1 = stm1+stm2;
		stm2 = stm1.substring(0, stm1.length()-stm2.length());
		stm1 = stm1.substring(stm2.length());
		System.out.println(stm1+" "+stm2);
		
	}
	
	
	
	public static void main(String[] args) {
		ProgramsPract pract = new ProgramsPract();
		anagramP();
		AScii();
		intToString();
		numOfIntInDigit();
		duplicateInArray();
		duplicateInArray1();
		hasshMapp();
		hassSet();
		facto();
		fibon();
		missingNumInArr();
		pract.removeJunk();
		pract.StringRev1usingBuilder();
		pract.StringRevUsingStringBuffer();
		pract.superClassOfJavaprogram();
		swapNu();
		SwapString();

	}
	
	

}
