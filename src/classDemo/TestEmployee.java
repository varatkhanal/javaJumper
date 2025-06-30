package classDemo;

public class TestEmployee {
	public Employee testSalary(Employee em, Employee e) {
		
		if(em.getSalary()>e.getSalary())
			return em;
		else
			return e;

	}
}
