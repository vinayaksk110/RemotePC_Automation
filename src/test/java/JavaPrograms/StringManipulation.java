package JavaPrograms;

public class StringManipulation {
	public static void main(String[] args) {
		String str = "The rains have started here selenium";
		String str1 = "The rains have started here selenium";
		String str2 = "The rains Have started here selenium";
		String s = "     Hello world";
		String splitting = "Hello_World_Testing_split";
		
		System.out.println("length of string "+str.length());
		
		System.out.println("character at 5th index :"+str.charAt(5));
		
		System.out.println("Index Value of s :"+str.indexOf('s'));  //first occurrence
		
		System.out.println("Index Value of 2nd s :"+str.indexOf('s',str.indexOf('s')+1));  //2nd occurrence of s
		
		System.out.println("Index Value of 3rd s :"+str.indexOf('s',str.indexOf('s',str.indexOf('s')+1)));  //3rd occurrence
		
		System.out.println("Index Value of have :"+str.indexOf("have"));
		
		System.out.println("Index Value of have :"+str.indexOf("hello"));  // return  -1
		
		System.out.println("Compare if both strings are same :"+str.equals(str1));
		
		System.out.println("Compare if both strings are same :"+str.equals(str2));  // false because case is change in str2
		
		System.out.println("Compare if both strings are same :"+str.equalsIgnoreCase(str2));  //true because ignores case
		
		System.out.println("substring rains :"+str.substring(4, 9)); 
		
		System.out.println("replaceAll :"+s.replaceAll(" ", ""));  //removes extra space
		
		System.out.println("trim :"+s.trim()); //trims extra space
		
		//Split function
		String splitArr[] = splitting.split("_");
		for(int i=0;i<splitArr.length;i++) {
			System.out.print(splitArr[i]+",");
		}
		
		
		
		
		
	}

}
