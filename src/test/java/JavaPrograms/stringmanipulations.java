package JavaPrograms;

public class stringmanipulations {
	
	public static void main(String[] args) {
		
		String x = "Hello";
		String y = "World";
		String z = "hello";
		String u = "ld";
		
		//concatination
		System.out.println(x+" "+y);
		
		//String length
		System.out.println("Length of string x is "+x.length());
		
		//character at
		System.out.println("character at 1 th position is "+x.charAt(1));
		
		//compare to
		System.out.println("compare to string"+x.compareTo(z));
		
		//comparetoIgnoring Case
		System.out.println(x.compareToIgnoreCase(z));
		
		//contains
		System.out.println("String contains text o : "+y.contains(u));
		
		//endswith
		System.out.println("ends with ld : "+y.endsWith(u));
		
		//replace
		System.out.println("replace the texts :"+y.replace("o", "O"));
		
		//touppercase
		System.out.println("convert to upper case :"+x.toUpperCase());
	}

}
