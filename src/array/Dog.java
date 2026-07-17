package array;

class Dog extends Animal {

	public void sound() {
		System.out.println("Dog barks");

	}

	public static void main(String[] args) {
		Dog dog = new Dog();

		dog.sound();
	}

}
