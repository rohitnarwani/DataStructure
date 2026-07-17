
public abstract class Shape {
	public Shape() {
		System.out.println("Shape Parent");
	}

	int a = 0;

	abstract void draw();

	void test() {
		System.out.println("test");
		HelloWorld hw = new HelloWorld();

	}

	private void test1() {

	}

	void test2() {

	}

	protected void test3() {

	}
}
