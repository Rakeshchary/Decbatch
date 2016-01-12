package basic.test.util;

public class Student implements Comparable<Student>{

	private int sno;
	private String sname;
	private int sfee;
	private String scourse;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSfee() {
		return sfee;
	}
	public void setSfee(int sfee) {
		this.sfee = sfee;
	}
	public String getScourse() {
		return scourse;
	}
	public void setScourse(String scourse) {
		this.scourse = scourse;
	}
	public Student(int sno, String sname, String scourse) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.sfee = sfee;
		this.scourse = scourse;
	}
	public Student() {
		super();
	
	}
	
	
	
	@Override
	public int hashCode() {
		int hashValue = this.sno + this.sname.hashCode();
		System.out.println("Hash Code" +hashValue);
		return hashValue;
	}	
	@Override
	public boolean equals(Object obj) {
		System.out.println(this.toString() + " vs " +obj);
		if(obj instanceof Student){
			Student stu = (Student) obj;
			if(this.sno == stu.getSno() && this.sname ==stu.getSname()){
				return true;
				
			}
		}
		return false;	
			
		}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", sfee=" + sfee + ", scourse=" + scourse + "]";
	}

	@Override
	public int compareTo(Student stu) {
		System.out.println("Compare**************");
		if(this.sno > stu.getSno()){
			return 1;
		}else{
			if(this.sno < stu.getSno()){
				return -1;
			}else{
				return 0;
			}
		}
	
	}
	
	}
	

