package basic.test.util;

import java.util.Comparator;

public class StudentNameSort implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
		return student1.getSname().compareTo(student2.getSname());
	}
	
	

}
