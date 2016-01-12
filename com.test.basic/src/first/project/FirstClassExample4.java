package first.project;

import java.util.*;
	/*from   w  w w.j a v a  2s . c  o  m*/
	public class FirstClassExample4 {

	   public static void main(String[] args) {

	      LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>(5);

	      // add some values in the map
	      map.put("One", 1);
	      map.put("Two", 2);
	      map.put("Three", 3);

	      System.out.println(map);

	      // get key "Three"
	      System.out.println(map.get("Three"));

	      // get key "Five"
	      System.out.println(map.get("Five"));
	   }
	}

