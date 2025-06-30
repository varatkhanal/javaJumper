package exception;

public class ThrowsDemo {
	
	 public static void main(String[] args) {
	
		int a=-5, b=1;
		
		System.out.println("hello");		
		ArithmeticOperaton ao = new ArithmeticOperaton();		
		
		try {
			ao.difference(a,b);
		}catch(NegativeNumberException e) {
			e.printStackTrace();
		}
		
		System.out.println("hello");	
	
	}

}
