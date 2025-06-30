package classDemo;

public class Employee {
	
	private int eid;
	private String name;
	private int salary;
	
	static String org;


	public static String getOrg() {
		return org;
	}

	public static void setOrg(String org) {
		Employee.org = org;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return "Employe [ Eid : "+eid+", Name : "+name+" and Salary : "+salary+"]";
	}
}
