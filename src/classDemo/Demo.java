package classDemo;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
	
		Employee.org = "Apex College";
		
		Employee emp = new Employee();
		emp.setEid(144);
		emp.setName("Rohit");
		emp.setSalary(180000);
		
		System.out.println(emp);
	
		Employee em = new Employee();
		em.setEid(108);
		em.setName("Ashit");
		em.setSalary(150000);
		
		TestEmployee te = new TestEmployee();
		Employee employe=te.testSalary(em,emp);
		
		System.out.println("Employee with id : "+employe.getEid()+" and Name : "+employe.getName()+" has highest salary");
		
		
		
	
	}

}
