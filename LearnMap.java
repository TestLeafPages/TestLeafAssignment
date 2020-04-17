package learnMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class LearnMap {
	
	public static void main(String[] args) {
			
		Map<String, String> mp = new TreeMap<String, String>();
		
		// Add entry(key and value)---> put()
		mp.put("AC001", "Babu");
		mp.put("AC002", "Gopi");
		mp.put("AC003", "Sarath");
		mp.put("AC004", "Balaji");
		mp.put("AC000", "Gopi");
		
		// for(DataType  eachItem   :   collection){
		
		// }
		
		for(Entry<String, String>  eachItem : mp.entrySet()) {
			
			if(eachItem.getValue().equals("Gopi")) {
				System.out.println(eachItem.getKey());
			}
			
		}
		
		
			
		/*
		 * // Count -------> size() 
		 * System.out.println(mp.size());
		 * 
		 * 
		 * // pick value from Map----> get(Key) 
		 * String value = mp.get("AC003");
		 * System.out.println(value);
		 * 
		 * 
		 * // remove the entry mp.remove("AC002"); 
		 * System.out.println(mp.size());
		 * 
		 * // validation 
		 * System.out.println(mp.containsKey("AC002"));
		 * System.out.println(mp.containsValue("Balaji"));
		 * 
		 * 
		 * // remove all entries 
		 * mp.clear();
		 * 
		 * 
		 * /
		 * System.out.println(mp.isEmpty());
		 */
		
	
		
		
		
		
	}

}
