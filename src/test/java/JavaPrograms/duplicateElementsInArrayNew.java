package JavaPrograms;

import java.util.HashSet;

public class duplicateElementsInArrayNew {
	
	public static void main(String[] args) {
		String names[] = {"Java", "random", "Python", "Java","java","random"};
		
		HashSet<String> store = new HashSet<String>();
		for(String nameset: names) {
			if(store.add(nameset)==false) {
				System.out.println("Duplicate names in array are : "+nameset);
			}
		}
		
		System.out.println("__________________________________________________________");
		
		for(int i=0;i<names.length;i++) {
			for(int j=i+1;j<names.length;j++) {
				if(names[i].equals(names[j])) {
					System.out.println("dupklicate string is :"+names[i]);
				}
			}
		}
	}

}
