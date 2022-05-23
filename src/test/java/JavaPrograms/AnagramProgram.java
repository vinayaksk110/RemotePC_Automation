package JavaPrograms;

import java.util.Arrays;

public class AnagramProgram {
	
	public static void main(String[] args) {
		isAnagram("keep", "peek");
		isAnagram("Mother In Law", "Hitler Woman");
	}
	
	static void isAnagram(String string1, String string2) {
		 String s1 = string1.replaceAll("\\s", "");
		 String s2 = string2.replaceAll("\\s", "");
		 boolean status = true;
		 if(s1.length()!=s2.length()) {
			 status = false;
		 }else {
			 char[] ArrayS1=s1.toLowerCase().toCharArray();
			 char[] ArrayS2=s2.toLowerCase().toCharArray();
			 Arrays.sort(ArrayS1);
			 Arrays.sort(ArrayS2);
			 status = Arrays.equals(ArrayS1, ArrayS2); 
		 }
		 
		 if(status) {
			 System.out.println(s1+" , "+s2+" are anagrams");
		 }else {
			 System.out.println(s1+" , "+s2+" are not anagrams");
		 }
	}

}
