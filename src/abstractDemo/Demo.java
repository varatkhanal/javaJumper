package abstractDemo;

public class Demo {

	public static void main(String[] args) {
		//Shape sh = new Shape();
		//sh.display();
		
		Shape shape= new Circle(6.7f);
		shape.display();
		System.out.println("area :"+shape.area());
		System.out.println("perimeter :"+shape.perimeter());
		
		shape= new Rectangle(6,7);
		shape.display();
		System.out.println("area :"+shape.area());
		System.out.println("perimeter :"+shape.perimeter());
		
		shape= new Square(6);
		shape.display();
		System.out.println("area :"+shape.area());
		System.out.println("perimeter :"+shape.perimeter());
		
	}

}
