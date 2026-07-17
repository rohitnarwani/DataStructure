
@FunctionalInterface
public interface TestInterface {

	public void test();

	default void print() {
		System.out.println("test");
	}

	default void print2() {
		System.out.println("test");
	}

}
