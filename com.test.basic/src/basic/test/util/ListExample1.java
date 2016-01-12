package basic.test.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ListExample1 {

	public static void main(String[] args) {
	     List<String> list = new ArrayList<String>();
		 list.add("abhi");
		 list.add("laddu");
		 list.add("sai");
		 list.add("raki");
		 list.add("rama");
		 list.add("pulli");
		 list.add("jakka");
		 
		 System.out.println("list" +list.size());
		 System.out.println("list" +list);
		 
		//Legacy 
		for( int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		System.out.println("=============================");
		//Enhanced for Loop
		for(String str:list){
			System.out.println(str.toUpperCase());
			
		}
		System.out.println("Before Delete" +list.size());
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()){
			String str = iterator.next();
			if(str.equals("jakka")){
				iterator.remove();
			}
		}
		
		System.out.println("After Delete" +list.size());
		
		ListIterator<String> listIterator = list.listIterator();
		while(listIterator.hasNext()){
			String str = listIterator.next();
			if(str.equals("john")){
				listIterator.remove();
			}else{
				listIterator.add("new element");
			}	 
	}
		System.out.println("After Delete" +list.size());
}
	}

