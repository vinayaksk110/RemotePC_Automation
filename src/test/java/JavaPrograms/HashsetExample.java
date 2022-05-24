package JavaPrograms;

import java.util.HashSet;

public class HashsetExample {
	
	public static void main(String[] args) {
		
		
		HashSet<String> gadgets = new HashSet<String>();
		gadgets.add("Laptop");
		gadgets.add("mobile");
		gadgets.add("earphones");
		gadgets.add("mouse");
		gadgets.add("keyboard");
		gadgets.add("charger");
		System.out.println(gadgets);
		System.out.println(gadgets.contains("mouse"));
		gadgets.remove("mobile");
		System.out.println(gadgets);
	}

}
