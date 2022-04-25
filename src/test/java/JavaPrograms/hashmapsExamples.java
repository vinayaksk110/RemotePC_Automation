package JavaPrograms;

import java.util.HashMap;

public class hashmapsExamples {
	
	public static void main(String[] args) {
		
		HashMap<String,String> cities = new HashMap<String,String>();
		cities.put("Karnataka", "Bengaluru");
		cities.put("Karnataka1", "Belagavi");
		cities.put("Maharashtra", "Mumbai");
		cities.put("", "null key");
		cities.put("null value","");
		System.out.println("Example of get :"+cities.get("Karnataka"));
		System.out.println(cities);
		System.out.println("removing :"+cities.remove("Karnataka1"));
		System.out.println(cities);
		
	}

}
