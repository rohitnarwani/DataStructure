import java.util.Arrays;
import java.util.List;
//import java.util.stream.Collectors;

public class StreamDemo {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("Anjali", 45000), new Employee("Vikram", 62000),
				new Employee("Rohan", 71000));

		// Processing Pipeline
		/*
		 * List<String> highEarners = employees.stream().filter(emp -> emp.getSalary() >
		 * 50000) // Filter logic .map(emp -> emp.getName().toUpperCase()) // Data
		 * transformation .collect(Collectors.toList()); // Terminal operation
		 * System.out.println(highEarners); // Output: [VIKRAM, ROHAN]
		 */}
}