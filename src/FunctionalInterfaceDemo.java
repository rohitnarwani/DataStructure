import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceDemo {
	public static void main(String[] args) {
		// 1. Predicate: Check if a number is even
		Predicate<Integer> isEven = num -> num % 2 == 0;
		System.out.println("Is 14 even? " + isEven.test(14)); // true
		// 2. Function: Convert a String to its length
		Function<String, Integer> stringLength = str -> str.length();
		System.out.println("Length of 'Java': " + stringLength.apply("Java")); // 4
		// 3. Consumer: Print a value in a custom format
		Consumer<String> greeter = name -> System.out.println("Hello, " + name);
		greeter.accept("Onboarding Fresher"); // Prints: Hello, Onboarding Fresher
		// 4. Supplier: Generate a random number
		Supplier<Double> randomSupplier = () -> Math.random();
		System.out.println("Random Value: " + randomSupplier.get());
	}
}
