package abstractDemo;

public class Circle extends Shape{
	private float radius;
	
	public Circle(float radius){
		this.radius = radius;
	}

	public void display() {
		System.out.println("this is circle");
	}
	public double area() {	
		return 3.14*radius*radius;
	}
	public double perimeter() {	
		return 2*3.14*radius;
	}
}
