package first.project;
import java.util.*;
public class FirstExample3 {
	

	   public static void main(String[] args) {

	      LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>(5);

	      // add some values in the map
	      map.put("One", 1);
	      map.put("Two", 2);
	      map.put("Three", 3);

	      System.out.println(map);

	      // check if map contains 3
	      System.out.println(map.containsValue(3));
	      // check if map contains 5
	      System.out.println(map.containsValue(5));
	   }
	}

