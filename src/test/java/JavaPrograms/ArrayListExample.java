package JavaPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		//Arraylist
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		boolean rr = list.contains(10);
		System.out.println(rr);
		
		for(Integer i:list) {
			System.out.println(i);
		}
		System.out.println("______________________________________________");
		
		//Hashset
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(101);
		set.add(102);
		set.add(120);
		boolean hs = set.contains(120);
		System.out.println(hs);
		for(Integer j:set) {
			System.out.println(j);
		}
		
	}

}
