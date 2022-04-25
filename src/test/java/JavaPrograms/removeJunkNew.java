package JavaPrograms;

public class removeJunkNew {
	
	public static void main(String[] args) {
		String rem = "@#$@#@#$HelloWorld$@#$@#$";
		rem=rem.replaceAll("[^A-Z,a-z,0-9]","");
		System.out.println(rem);
	}

}
