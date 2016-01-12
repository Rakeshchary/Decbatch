package basic.test.util;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapExample {
	
	public static void main(String[] args){
		Map<String,String>dataMap = new Hashtable<String,String>();
		dataMap.put("101","Rama");
		dataMap.put("201","Raki");
		dataMap.put("301","Pulli");
		dataMap.put("401","Ken");
		dataMap.put("101","Jhon");
		
		String name = dataMap.get("401");
		
		System.out.println("Name" +name);
		
		Set<String> keyset = dataMap.keySet();
		System.out.println("keys");
		for(String key:keyset){
			System.out.println(dataMap.get(key));
		}
		System.out.println("Values");
		Collection<String>valueList = dataMap.values();
		
		System.out.println(valueList);
		
		System.out.println(dataMap);
	}

}
