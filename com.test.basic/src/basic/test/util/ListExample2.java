package basic.test.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.omg.Messaging.SyncScopeHelper;

public class ListExample2 {

	public static void main(String[] args) {
	     List<String> list = new ArrayList<String>();
		 list.add("abhi");
		 list.add("laddu");
		 list.add("sai");
		 list.add("raki");
		 list.add("rama");
		 list.add("pulli");
		 list.add("jakka");
		 
		 
		 List<String> searchlist = new ArrayList<String>();
		 searchlist.add("laddu");
		 searchlist.add("Dillip");
		 searchlist.add("sandeep");
		 searchlist.add("venkat");
		 
		 System.out.println("Before Remove" +list);
		 if(list.contains("pulli")){
			 System.out.println("Elements Found");
		 } else{
			 System.out.println("Not Found");
		 }
		 if(list.containsAll(searchlist)){
			 System.out.println("Elements Found");
		 } else{
			 System.out.println("Not Found");
		 
		 }
		 list.remove("pulli");
		 System.out.println("After Remove" +list);
		 
		 Collections.sort(list);
		 System.out.println("After sort" +list);
			 
	}

}
