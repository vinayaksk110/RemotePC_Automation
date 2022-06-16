package JavaPrograms;

public class reverseString {
	
	public static void main(String[] args) {
		//no reverse function in String
		//String are immutable
		String s = "Hello World";
		int len = s.length();
		String rev ="";
		
		for (int i=len-1;i>=0;i--) {
			rev = rev +s.charAt(i);	
		}
		System.out.println("reverse normally :"+rev);
		
		
		//Using Stringbuffer
		StringBuffer strbuf = new StringBuffer(s);
		System.out.println("reverse using string buffer :"+strbuf.reverse());
		
		//using StringBuilder
		StringBuilder str2 = new StringBuilder();
		str2.append(s);
		System.out.println("reverse using StringBuilder :"+str2.reverse());
	}
}
