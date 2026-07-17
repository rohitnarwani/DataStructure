package array;

public class MathOperation {
	int add(int a, int b) {
		return a+b;
	}
	int add(int a, int b,int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		MathOperation math = new MathOperation();
		math.add(1, 3);
		math.add(1, 3, 5);
	}

}
