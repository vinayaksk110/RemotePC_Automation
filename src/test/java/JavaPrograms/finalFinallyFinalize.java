package JavaPrograms;

public class finalFinallyFinalize {
	
	public static void main(String[] args) {
		
		//final
		
		final int i =10;  // final is used to define constant variable
		
		//to prevent inheritance we use final, public final class parentClass
		//to prevent method overridign we use final, public final void start()
		
		//finally
		finallyTestWithCatch();
		finallywithoutCatch();
		
		
	}
	
	static void finallyTestWithCatch() {
		try {
			System.out.println("Inside try block");
			throw new RuntimeException("test");
		}catch(Exception e){
			System.out.println("Inside of catch block");
		}finally {
			System.out.println("Inside finally block");
		}
	}
	
	static void finallywithoutCatch() {
		try {
			System.out.println("Inside try method without catch");
		}finally {
			System.out.println("Inside finally method without catch");
		}
	}

}
