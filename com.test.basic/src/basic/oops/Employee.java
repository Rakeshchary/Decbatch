package basic.oops;


public class Employee {

	 int eno;
	 String ename;
	 float salary;
	 static int count;
	 
	 public static void printCount(){
		 System.out.println("Count " + count);
	 }

	public Employee(int eno, String ename, float salary) {
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
	}

	public Employee() {
		// no-op
	}

	public Employee(int eno) {
		this.eno = eno;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	protected float getFedTaxAmount() {
		return (salary * 30) / 100;
	}

	protected float getStateTaxAmount() {
		return (salary * 8) / 100;
	}

	
	
}
