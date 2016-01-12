package basic.oops;


public class EmployeeApp {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Employee.count = 100;
		System.out.println(" Count " + Employee.count);
		Employee.printCount();
		
		Employee emp = new Employee();
		
		System.out.println("Count " + emp.count);
		emp.printCount();
		
		emp.eno =101;
		emp.ename="Rama";
		emp.salary=5600;
		/*emp.setEno(101);
		emp.setEname("Rama");
		emp.setSalary(4500);*/
		
		System.out.println(" Eno " + emp.getEno());
		System.out.println(" Ename " + emp.getEname());
		System.out.println(" Salary " + emp.getSalary());
		System.out.println( " Fed Tax " + emp.getFedTaxAmount());
		System.out.println(" State Tax " + emp.getStateTaxAmount());
		
		
		

	}

}
