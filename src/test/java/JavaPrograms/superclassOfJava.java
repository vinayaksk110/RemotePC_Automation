package JavaPrograms;

public class superclassOfJava {
	
	public static void main(String[] args) {
		
		// this is to test the new line
		superclassOfJava obj = new superclassOfJava();
		Class cls = obj.getClass().getSuperclass();
		System.out.println(cls.getName());
		System.out.println(cls);
		
	}
}
