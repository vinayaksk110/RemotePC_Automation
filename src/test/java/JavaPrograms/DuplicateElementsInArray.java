package JavaPrograms;

import java.util.HashMap;
import java.util.HashSet;

public class DuplicateElementsInArray {
	
	public static void main(String[] args) {
		
		String name[]= {"java","jenkins","git","selenium","git","java" };
		
		//compare all elements  O(nxn)  --------Worst solution
		for( int i =0;i<name.length;i++) {
			for(int j =i+1;j<name.length;j++) {
				
				if(name[i].equals(name[j])) {
					System.out.println("duplicate elements are :"+name[i]);
				}
			}
		}
		
		System.out.println("*************************************************");
		
		//using hashset -- O(n)
		HashSet<String> store = new HashSet<String>();
		for(String nameset: name) {
			if(store.add(nameset)==false) {
				System.out.println("duplicate elements are :"+nameset);
			}
		}
		
		System.out.println("*************************************************");
		//usingHashmap O(2n)
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(String namemap:name) {
			Integer count= map.get(namemap);
			if(count==null) {
				map.put(namemap, 1);
			}
			else {
				System.out.println("duplicate elements are :"+namemap);
			}
		}
	}

}
