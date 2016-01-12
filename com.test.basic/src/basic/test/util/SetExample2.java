package basic.test.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetExample2 {

	public static void main(String[] args) {
		Set<Student> stuSet = new TreeSet<Student>(new StudentFeeSort());//new HashSet<Student>();//new LinkedList<Student>();//new ArrayList<Student>();
        stuSet.add(new Student(101,"abhi","Ms"));
        stuSet.add(new Student(252,"sandeep","Mba"));
        stuSet.add(new Student(565,"dimple","Mtech"));
        stuSet.add(new Student(456,"rama","Mscs"));
        stuSet.add(new Student(528,"laddu","Ba"));
        stuSet.add(new Student(451,"ajay","Btech"));
        
        stuSet.add(new Student(101,"abhi","Ms"));
        stuSet.add(new Student(252,"sandeep","Mba"));
        stuSet.add(new Student(565,"dimple","Mtech"));
        stuSet.add(new Student(456,"rama","Mscs"));
        stuSet.add(new Student(528,"laddu","Ba"));
        stuSet.add(new Student(451,"ajay","Btech"));
        
        System.out.println("size" +stuSet.size());
        System.out.println("Data :" +stuSet);
        	
        }
        
        
	
}

