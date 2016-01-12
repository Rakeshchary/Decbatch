package first.project;

	import java.util.LinkedHashMap;
	/*from  w w  w  .j  a  v  a2  s . c  om*/
	public class FirstClassExample2 {

	   public static void main(String[] args) {

	      LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>(5);

	      // add some values in the map
	      map.put("One", 1);
	      map.put("Two", 2);
	      map.put("Three", 3);


	      System.out.println(map);

	      // clear the map
	      map.clear();


	      System.out.println(map);
	   }
	}

