package JavaPrograms;

public class ThrowAndThrows {
	
	    // defining a user-defined method  
	    // which throws ArithmeticException  
	    static void method1() throws ArithmeticException  
	    {  
	        System.out.println("Inside the method1()");  
	        throw new ArithmeticException("throwing ArithmeticException");  
	    }  
	    //main method  
	    public static void main(String args[])  
	    {  
	        try  
	        {
	            method1();  
	        }  
	        catch(ArithmeticException e)  
	        {  
	            System.out.println("caught in main() method");  
	        }  
	    }  
	}  

}
