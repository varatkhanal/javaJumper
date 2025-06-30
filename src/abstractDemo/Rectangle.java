package abstractDemo;

public class Rectangle extends Shape{
	private int length;
	private int breadth;
	
	public Rectangle() {}
	
	public Rectangle(int length, int breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	
	public void setLength(int length) {
		this.length = length;
		}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
		}
	public double area() {
		return length*breadth;
	}
	public double perimeter() {
		return 2*(length+breadth);
	}
	public void display() {
		System.out.println("this is rectangular shape");
	}

}
