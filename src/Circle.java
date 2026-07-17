
public class Circle extends Shape {
	public Circle() {
		System.out.println("Circle");
	}

	@Override
	void draw() {
		System.out.println("Draw Circle");
		
	}
	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();
		//c.test();
		//c.test3();
		
		
	}

}
