package JavaPrograms;

public class finalizePractice {
	
	public void finalize() {
		System.out.println("finalize method");
	}
	
	public static void main(String[] args) {
		
		finalizePractice f1 =  new finalizePractice();
		finalizePractice f2 =  new finalizePractice();
		
		f1=null;
		f2=null;
		
		System.gc();
	}

}
