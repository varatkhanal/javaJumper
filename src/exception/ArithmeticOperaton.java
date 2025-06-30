package exception;

public class ArithmeticOperaton {
	public void division(int a, int b) throws ArithmeticException{	

			System.out.println(a/b);	

		
	}
	public void difference(int a, int b) throws NegativeNumberException{	

		if(a<0)	
			throw new NegativeNumberException();
		else {
			System.out.println("diff is :"+(a-b));
		}

	
}
}
