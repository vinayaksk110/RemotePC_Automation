package JavaPrograms;

public class removeJunkFromString {
	
	public static void main(String[] args) {
		String s = "#@$$@#$ Hello world 23324#$%";
		
		//regular expression[^a-zA-Z0-9]
		
		s = s.replaceAll("[^a-zA-Z0-9 ]", "");
		System.out.println(s);
	}

}
