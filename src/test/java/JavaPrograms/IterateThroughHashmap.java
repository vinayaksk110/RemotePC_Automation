package JavaPrograms;

import java.util.HashMap;
import java.util.Map;

public class IterateThroughHashmap {
	
	public static void main(String[] args) {
		HashMap<String , String> maps = new HashMap<String , String>();
		maps.put("Bangalore", "Karnataka");
		maps.put("Maharashtra", "Mumbai");
		maps.put("Kerala", "Kochi");
		maps.put("Tamilnadu", "Chennai");
		
		
//		Reading Keys and values from HashMap
		for(Map.Entry<String , String> ent:maps.entrySet()) {
			System.out.println("key is :"+ent.getKey()+ ",  valus is :"+ent.getValue());
		}
		
	}

}
