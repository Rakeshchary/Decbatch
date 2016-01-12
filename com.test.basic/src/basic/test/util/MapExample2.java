package basic.test.util;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapExample2 {
	

	public static void main(String[] args){
		Map<Student,String>dataMap = new HashMap<Student,String>();//new Hashtable<Student,String>();
		dataMap.put(new Student(521,"MS","Rama"),"Rama");
		dataMap.put(new Student(555,"MTECH","Abhi"),"Abhi");
		dataMap.put(new Student(1024,"MBA","Raki"),"Raki");
		dataMap.put(new Student(555,"MSCS","Hari"),null);
		
		System.out.println(dataMap);
		String name = dataMap.get(new Student(555,"MSCS","Hari"));
		System.out.println("Name" +name);
}

}