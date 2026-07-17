package encapsulation;

public class EncapsulationDemo {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("Test");
		s.setAge(25);
		System.out.println("Name: " + s.getName());
		System.out.println("Age: " + s.getAge());
	}

}
