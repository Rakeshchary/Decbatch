package basic.test.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListExample3 {

	public static void main(String[] args) {
		List<Student> stuList = new LinkedList<Student>();//new ArrayList<Student>();
        stuList.add(new Student(101,"abhi","Ms"));
        stuList.add(new Student(252,"sandeep","Mba"));
        stuList.add(new Student(565,"dimple","Mtech"));
        stuList.add(new Student(456,"rama","Mscs"));
        stuList.add(new Student(528,"laddu","Ba"));
        stuList.add(new Student(451,"ajay","Btech"));
        
        System.out.println("size" +stuList.size());
        System.out.println("Data :" +stuList);
        
        if(stuList.contains(new Student(456,"rama","Mscs"))){
        	System.out.println("Element Found");
        }else{
        	System.out.println("Not Found");
        	
        }
        System.out.println("Before sort" +stuList);
        Collections.sort(stuList,new StudentFeeSort());
        System.out.println("After sort" +stuList);
        
        }
	
}

